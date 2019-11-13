package main.java.com.gabrielspassos.poc;

import java.io.IOException;

public class AnalisadorSintatico extends Parser {

    public AnalisadorSintatico(String codeFileName) throws IOException {
        super(codeFileName);
    }

    @Override
    public Boolean parse() {
        return analisaMiniJava();
    }

    private Boolean analisaMiniJava() {
        return true;
    }
}
