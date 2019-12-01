package main.java.com.gabrielspassos.poc;

import java.nio.file.FileSystems;
import java.nio.file.Path;

public class GeradorByteCode {

    public void generateByteCode(String fileName) {
        try{
            Runtime run = Runtime.getRuntime();
            String pathToFile = getPathToFile(fileName);
            String gerarByteCode = "javac " + pathToFile;
            System.out.println("Gerando ByteCode:\n"+gerarByteCode);
            run.exec(gerarByteCode);
            System.out.println("BYTECODE GERADO COM SUCESSO");
        }catch(Exception err){
            System.out.println("ERRO! na geração do bytecode " + err.getMessage());
        }
    }

    private String getPathToFile(String fileName) {
        Path path = FileSystems.getDefault().getPath(fileName).toAbsolutePath();
        System.out.println("Caminho até o arquivo "+ path);
        return path.toString();
    }
}
