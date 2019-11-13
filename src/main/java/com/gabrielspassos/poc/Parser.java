package main.java.com.gabrielspassos.poc;

import java.io.IOException;

public abstract class Parser {

    public TabelaSimbolos tabelaSimbolos;
    public AnalisadorLexico analisadorLexico;
    public Token token;

    public Parser(String codeFileName) throws IOException {
        this.tabelaSimbolos = new TabelaSimbolos();
        this.analisadorLexico = new AnalisadorLexico(codeFileName);
    }

    public abstract Boolean parse();

    public void getToken() {
        token = analisadorLexico.getToken();
    }

    public Boolean error(String message) {
        System.out.println(message + " " + token.getTipo() + " .Na linha " + token.getLinha() + " e coluna " + token.getColuna());
        return false;
    }
}
