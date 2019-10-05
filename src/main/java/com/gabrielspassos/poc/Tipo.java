package main.java.com.gabrielspassos.poc;

import java.util.stream.Stream;

public enum Tipo {

    SCLASS("class"),
    SPUBLIC("public"),
    SSTATIC("static"),
    SVOID("void"),
    SMAIN("main"),
    SSTRING("String"),
    SEXTENDS("extends"),
    SATRIBUICAO("="),
    SESCREVA("System.out.println"),
    SINTEIRO("int"),
    SBOOLEAN("boolean"),
    SIF("if"),
    SELSE("else"),
    SWHILE("while"),
    SLENGTH("length"),
    STHIS("this"),
    SNEW("new"),
    SNEGATE("!"),
    SVIRGULA(","),
    SPONTO_E_VIRGULA(";"),
    SPONTO("."),
    SMAIS("+"),
    SMENOS("-"),
    SMULTIPLICACAO("*"),
    SAND("&&"),
    SMENOR("<"),
    SABRE_PARENTESIS("("),
    SFECHA_PARENTESIS(")"),
    SABRE_COLCHETES("["),
    SFECHA_COLCHETES("]"),
    SABRE_CHAVES("{"),
    SFECHA_CHAVES("}"),
    SNUMERO(null),
    SERRO(null),
    SIDENTIFICADOR(null),
    SDIVISAO("/"),
    SCHAR("char"),
    SNULL ("null"),
    SRETURN("return"),
    SBOOLEAN_TRUE("true"),
    SBOOLEAN_FALSE("false"),
    SIGUALDADE("=="),
    SDIFERENCA("!=");

    Tipo(String id) {
        this.id = id;
    }

    private String id;

    public static Tipo getTipoById(String id) {
        return Stream.of(Tipo.values())
                .filter(tipo -> id.equals(tipo.id))
                .findFirst()
                .orElse(Tipo.SIDENTIFICADOR);
    }

    public String getId() {
        return id;
    }
}
