package main.java.com.gabrielspassos.poc;

public class AnalisadorSemantico {

    public void validaOperacao(String operando1, Token operacao, String operando2, TabelaSimbolos tabelaSimbolos) {
        Token primeiroOperando = tabelaSimbolos.getTabela().get(operando1);
        Token segundoOperando = tabelaSimbolos.getTabela().get(operando2);

        if (primeiroOperando != null && Tipo.SBOOLEAN.getId().equals(primeiroOperando.getTipagem())) {
            error("Não é possível realizar operações com tipo booleano", primeiroOperando);
            throw new IllegalStateException("Não é possível realizar operações com tipo booleano");
        }

        if (segundoOperando != null && Tipo.SBOOLEAN.getId().equals(segundoOperando.getTipagem())) {
            error("Não é possível realizar operações com tipo booleano", segundoOperando);
            throw new IllegalStateException("Não é possível realizar operações com tipo booleano");
        }

        if (Tipo.SDIVISAO.equals(operacao.getTipo()) && "0".equals(operando2)) {
            System.out.println("Não é possível realiza divisão por zero");
            throw new IllegalStateException("Não é possível realiza divisão por zero");
        }
    }

    private void error(String message, Token token) {
        System.out.println(message + " " + token.getTipo() + " .Na linha " + token.getLinha() + " e coluna " + token.getColuna());
    }
}
