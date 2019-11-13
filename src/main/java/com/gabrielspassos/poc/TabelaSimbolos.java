package main.java.com.gabrielspassos.poc;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class TabelaSimbolos {

    private Map<String, Token> tabela;

    public TabelaSimbolos() {
        this.tabela = new HashMap<>();
    }

    public void setAtributo(String chave, String atributo, String valor) throws NoSuchFieldException, IllegalAccessException {
        Token token = tabela.get(chave);
        Field field = token.getClass().getDeclaredField(atributo);
        field.set(token, valor);
    }

    public String getAtributo(String chave, String atributo) throws NoSuchFieldException, IllegalAccessException {
        Token token = tabela.get(chave);
        Field field = token.getClass().getDeclaredField(atributo);
        return (String) field.get(token);
    }

    public Map<String, Token> getTabela() {
        return tabela;
    }
}
