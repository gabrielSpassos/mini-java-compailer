package main.java.com.gabrielspassos.poc;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnalisadorLexico {

    private static final String ENCODING = "US-ASCII";
    private int linha = 1;
    private int coluna = 0;

    private static final List<String> CHARS_TO_IGNORE =
            Arrays.asList(" ", "\n", "\r", "\t", "@");
    private static final List<String> SPECIAL_CHARS =
            Arrays.asList(".", ":", ",", ";", "(", ")", "=", "!", "{", "}", "<", "&", "[", "]", "*");
    private static final String AND_SYMBOL = "&";
    private static final String UNDER_LINE_SYMBOL = "_";
    private static final String BAR_SYMBOL = "/";
    private static final String EQUALS_SYMBOL = "=";
    private static final String NEGATE_SYMBOL = "!";
    private static final String ASTERISK_SYMBOL = "*";

    public List<Token> analise(String codeFileName) throws IOException {
        PushbackReader pushbackReader = getPushbackReader(codeFileName);
        List<Token> tokens = new ArrayList<>();

        char character;
        do {
            character = readChar(pushbackReader);
            if (CHARS_TO_IGNORE.contains(String.valueOf(character))) {
                continue;
            }
            Token token = getToken(character, pushbackReader);
            if (token != null) {
                tokens.add(token);

                if (Tipo.SERRO.equals(token.getTipo())) {
                    break;
                }
            }
        } while (character != '@');

        return tokens;
    }

    private PushbackReader getPushbackReader(String codeFileName) throws FileNotFoundException, UnsupportedEncodingException {
        return new PushbackReader(new BufferedReader(new InputStreamReader(new FileInputStream(codeFileName), ENCODING)));
    }

    private char readChar(PushbackReader pushbackReader) throws IOException {
        int intch = pushbackReader.read();
        char character = (char) intch;
        if(character == '\n') {
            linha++;
            coluna = 0;
        } else {
            coluna++;
        }

        if(intch != -1) {
            return character;
        } else {
            return '@';
        }
    }

    private void unreadChar(PushbackReader pushbackReader, char character) throws IOException {
        pushbackReader.unread(character);
        if(character == '\n') {
            linha--;
        } else {
            coluna--;
        }
    }

    private Token getToken(char character, PushbackReader pushbackReader) throws IOException {
        if(Character.isLetter(character)) {
            int col = coluna;
            return handleIdentifierAndReservedWord(character, pushbackReader, col);
        }

        if (Tipo.SMAIS.getId().equals(String.valueOf(character))
                || Tipo.SMENOS.getId().equals(String.valueOf(character))) {
            int col = coluna;
            return handlePlusAndMinusOperation(character, pushbackReader, col);
        }

        if(Character.isDigit(character)) {
            int col = coluna;
            return handleDigit(character, pushbackReader, col);
        }

        if(SPECIAL_CHARS.contains(String.valueOf(character))){
            int col = coluna;
            return handleSpecialChars(character, pushbackReader, col);
        }

        if(BAR_SYMBOL.equals(String.valueOf(character))){
            int col = coluna;
            return handleBar(character, pushbackReader, col);
        }

        return new Token(Tipo.SERRO, String.valueOf(character), linha, coluna);
    }

    private Token handleIdentifierAndReservedWord(char character, PushbackReader pushbackReader, int coluna) throws IOException {
        String id = String.valueOf(character);
        char nextCharacter = readChar(pushbackReader);
        while (Character.isLetter(nextCharacter)
                || UNDER_LINE_SYMBOL.equals(String.valueOf(nextCharacter))
                || Character.isDigit(nextCharacter)) {
            id = id.concat(String.valueOf(nextCharacter));
            nextCharacter = readChar(pushbackReader);
        }
        unreadChar(pushbackReader, nextCharacter);
        Tipo tipo = Tipo.getTipoById(id);
        return new Token(tipo, id, linha, coluna);
    }

    private Token handlePlusAndMinusOperation(char character, PushbackReader pushbackReader, int coluna) throws IOException {
        String operator = String.valueOf(character);
        char nextCharacter = readChar(pushbackReader);
        if (Character.isSpaceChar(nextCharacter)) {
            Tipo tipo = Tipo.getTipoById(operator);
            return new Token(tipo, operator, linha, coluna);
        }
        Token token = handleDigit(nextCharacter, pushbackReader, coluna);
        token.setLexema(operator.concat(token.getLexema()));
        return token;

    }

    private Token handleDigit(char character, PushbackReader pushbackReader, int coluna) throws IOException {
        String num = String.valueOf(character);
        char nextCharacter = readChar(pushbackReader);
        while (Character.isDigit(nextCharacter) || Tipo.SPONTO.getId().equals(String.valueOf(nextCharacter))) {
            if (isInvalidFloatNumber(String.valueOf(nextCharacter), pushbackReader)) {
                return new Token(Tipo.SERRO, String.valueOf(nextCharacter), linha, coluna);
            }
            num = num.concat(String.valueOf(nextCharacter));
            nextCharacter = readChar(pushbackReader);
        }
        unreadChar(pushbackReader, nextCharacter);
        return new Token(Tipo.SNUMERO, num, linha, coluna);
    }

    private Token handleSpecialChars(char character, PushbackReader pushbackReader, int coluna) throws IOException {
        String specialCharacter = String.valueOf(character);

        if(isComposeChar(specialCharacter)) {
            char nextCharacter = readChar(pushbackReader);
            String ch = specialCharacter.concat(String.valueOf(nextCharacter));
            Tipo tipoById = Tipo.getTipoById(ch);
            if (isComposeType(tipoById)) {
                return new Token(tipoById, ch, linha, coluna);
            }
            unreadChar(pushbackReader, nextCharacter);
        }

        Tipo tipo = Tipo.getTipoById(specialCharacter);
        return new Token(tipo, specialCharacter, linha, coluna);
    }

    private Boolean isComposeChar(String character) {
        return AND_SYMBOL.equals(character) || EQUALS_SYMBOL.equals(character) || NEGATE_SYMBOL.equals(character);
    }

    private Boolean isComposeType(Tipo tipo) {
        return Tipo.SAND.equals(tipo) || Tipo.SIGUALDADE.equals(tipo) || Tipo.SDIFERENCA.equals(tipo);
    }

    private Token handleBar(char character, PushbackReader pushbackReader, int coluna) throws IOException {
        char nextCharacter = readChar(pushbackReader);

        if(BAR_SYMBOL.equals(String.valueOf(nextCharacter))){
            nextCharacter = readChar(pushbackReader);
            while (!System.lineSeparator().equals(String.valueOf(nextCharacter))) {
                nextCharacter = readChar(pushbackReader);
            }
            return null;

        }else if(ASTERISK_SYMBOL.equals(String.valueOf(nextCharacter))){
            while (true) {
                nextCharacter = readChar(pushbackReader);

                if(ASTERISK_SYMBOL.equals(String.valueOf(nextCharacter))){
                    nextCharacter = readChar(pushbackReader);
                    if(BAR_SYMBOL.equals(String.valueOf(nextCharacter))){
                        break;
                    }
                }
            }
            return null;
        }else{
            unreadChar(pushbackReader, nextCharacter);
            String id = String.valueOf(character);
            Tipo tipo = Tipo.getTipoById(id);
            return new Token(tipo, id, linha, coluna);
        }
    }

    private Boolean isInvalidFloatNumber(String character, PushbackReader pushbackReader) throws IOException {
        if (Tipo.SPONTO.getId().equals(character)) {
            char nextCharacter = readChar(pushbackReader);
            if(Tipo.SPONTO.getId().equals(String.valueOf(nextCharacter))) {
                return true;
            }
            unreadChar(pushbackReader, nextCharacter);
            return false;
        }
        return false;
    }
}
