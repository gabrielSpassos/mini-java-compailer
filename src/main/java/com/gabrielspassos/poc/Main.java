package main.java.com.gabrielspassos.poc;

import java.util.Arrays;
import java.util.List;

public class Main {

    private static final String DEFAULT_FILE = "sum.java";

    public static void main(String[] args) {
        try {
            String fileName = getFileName(args);
            Runtime run = Runtime.getRuntime();
            AnalisadorSintatico analisadorSintatico = new AnalisadorSintatico(fileName);
            System.out.println("Analisando o arquivo " + fileName);
            System.out.println("Analise Sintatica: " + analisadorSintatico.analisaMiniJava());

            //GERA O BYTECODE DO ARQUIVO TESTADO
            System.out.println("GERANDO BYTECODE...");
                try{
                    String gerarByteCode = "javac " + DEFAULT_FILE;
                    run.exec(gerarByteCode);
                    System.out.println("BYTECODE GERADO COM SUCESSO");
                }catch(Exception err){
                    System.out.println("ERRO! na geração do bytecode " + err.getMessage());
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
