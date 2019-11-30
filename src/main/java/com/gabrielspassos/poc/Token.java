package main.java.com.gabrielspassos.poc;

public class Token {

    public Tipo tipo;
    public String lexema;
    public String escopo;
    public Integer linha;
    public String tipagem;
    public Integer coluna;

    public Token(Tipo tipo, String lexema, Integer linha, Integer coluna) {
        this.tipo = tipo;
        this.lexema = lexema;
        this.linha = linha;
        this.coluna = coluna;
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

    public String getTipagem() {
        return tipagem;
    }

    public void setTipagem(String tipagem) {
        this.tipagem = tipagem;
    }

    @Override
    public String toString() {
        return String.format("Tipo: %s, Lexama: %s, Linha: %s, Coluna: %s, Escopo: %s, Tipagem: %s", tipo, lexema, linha, coluna, escopo, tipagem);
    }
}
