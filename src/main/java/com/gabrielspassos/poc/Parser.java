package main.java.com.gabrielspassos.poc;

import java.io.IOException;

public abstract class Parser {

    public TabelaSimbolos tabelaSimbolos;
    public AnalisadorLexico analisadorLexico;
    public AnalisadorSemantico analisadorSemantico;
    public Token token;

    public Parser(String codeFileName) throws IOException {
        this.tabelaSimbolos = new TabelaSimbolos();
        this.analisadorLexico = new AnalisadorLexico(codeFileName);
        this.analisadorSemantico = new AnalisadorSemantico();
    }

    public void fetchToken() {
        token = analisadorLexico.getToken();
    }

    public Boolean error(String message) {
        System.out.println(message + " .Na linha " + token.getLinha() + " e coluna " + token.getColuna());
        return false;
    }
}
