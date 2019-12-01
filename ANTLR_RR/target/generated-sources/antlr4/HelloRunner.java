import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
    
public class HelloRunner {

	public static void main(String[] args) throws IOException {
		
		try {
			
			CharStream input = CharStreams.fromString("programa teste ;"
														+ "var x: inteiro;"
														+ "inicio x := 3;"
															+ "escreva(1336 + x);"
														+ "fim.");   
			
			GramaticaLexer lexer = new GramaticaLexer(input);
			
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			
			GramaticaParser parser = new GramaticaParser(tokens);
			
			System.out.println("O COMPILADOR INICIOU!");

			ParseTree tree = parser.prog(); // inicio do parsing da regra 'prog'
			
			System.out.println("O COMPILADOR TERMINOU!");
			
			
			System.out.println(tree.toStringTree(parser)); // print arv LISP-style		
			
		}catch(Exception e){
			
			System.err.println("ERRO: "+ e.getMessage());
			
		}

	}

}