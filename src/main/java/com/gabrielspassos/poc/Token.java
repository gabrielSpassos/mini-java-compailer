package main.java.com.gabrielspassos.poc;

public class Token {

    private Tipo tipo;
    private String lexema;
    private Integer linha;
    private Integer coluna;

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

    @Override
    public String toString() {
        return String.format("Tipo: %s, Lexama: %s, Linha: %s, Coluna: %s", tipo, lexema, linha, coluna);
    }
}
