package main.java.com.gabrielspassos.poc;

import java.util.Arrays;
import java.util.List;

public class Main {

    private static final String DEFAULT_FILE = "sum.java";

    public static void main(String[] args) {
        try {
            String fileName = getFileName(args);
            AnalisadorSintatico analisadorSintatico = new AnalisadorSintatico(fileName);
            GeradorByteCode geradorByteCode = new GeradorByteCode();
            System.out.println("Analisando o arquivo " + fileName);
            Boolean analiseMiniJava = analisadorSintatico.analisaMiniJava();
            System.out.println("Analise Sintatica: " + analiseMiniJava);
            if (analiseMiniJava) {
                geradorByteCode.generateByteCode(fileName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String getFileName(String[] args) {
        return Arrays.stream(args)
                .findFirst()
                .orElse(DEFAULT_FILE);
    }
}
