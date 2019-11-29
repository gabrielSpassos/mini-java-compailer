package main.java.com.gabrielspassos.poc;

public class Token {

    private Tipo tipo;
    private String lexema;
    private String escopo;
    private Integer linha;
    private Integer coluna;

    public Token(Token oldToken, String escopo) {
        this.tipo = oldToken.tipo;
        this.lexema = oldToken.lexema;
        this.escopo = escopo;
        this.linha = oldToken.linha;
        this.coluna = oldToken.coluna;
    }

    public Token(Tipo tipo, String lexema, Integer linha, Integer coluna) {
        this.tipo = tipo;
        this.lexema = lexema;
        this.linha = linha;
        this.coluna = coluna;
    }

    public Token(Tipo tipo, String lexema) {
        this.tipo = tipo;
        this.lexema = lexema;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public Integer getLinha() {
        return linha;
    }

    public void setLinha(Integer linha) {
        this.linha = linha;
    }

    public Integer getColuna() {
        return coluna;
    }

    public void setColuna(Integer coluna) {
        this.coluna = coluna;
    }

    public String getEscopo() {
        return escopo;
    }

    public void setEscopo(String escopo) {
        this.escopo = escopo;
    }

    @Override
    public String toString() {
        return String.format("Tipo: %s, Lexama: %s, Linha: %s, Coluna: %s, Escopo: %s", tipo, lexema, linha, coluna, escopo);
    }
}
