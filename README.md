# Mini Java Compiler - Compiladores Grau B

Projeto para realizar a compilação de um arquivo escrito na linguagem [Minijava](http://www.cambridge.org/us/features/052182060X/) para gerção de Bytecode. O trabalho foi realizado pelos seguintes alunos:

- [Eduardo Amroginski](https://github.com/CrazyAMK)
- Matrícula: 2015111384

- [Gabriel Passos](https://github.com/gabrielSpassos)
- Matrícula: 201514565

- [Matheus Schonarth](https://github.com/mfschonarth)
- Matrícula: 201513395

Dentre os principais arquivos do trabalho, pode-se citar:

- src -> pasta que contém as classes desenvolvidas para o trabalho (AnalisadorLexico, Main, Tipo, Token).

- sum.java -> arquivos em MiniJava utilizados para testar o programa. O arquivo que será analisado é o que foi estabelecido na classe Main.

- Classe [Tipo](https://github.com/gabrielSpassos/mini-java-compailer/blob/master/src/main/java/com/gabrielspassos/poc/Tipo.java)
contêm as palavras revervadas, operadores e por eles que se encontra o Tipo do Token

- Classe [AnalisadorLexico](https://github.com/gabrielSpassos/mini-java-compailer/blob/master/src/main/java/com/gabrielspassos/poc/AnalisadorLexico.java)
contêm método para a busca de lista de Tokens, faz a leitura dos caracteres do código fonte e lida com os mesmo retornando o respectivo Token.

- Classe [Analisador Sintático](https://github.com/gabrielSpassos/mini-java-compiler/blob/master/src/main/java/com/gabrielspassos/poc/AnalisadorSintatico.java) verifica se a ordem das palavras é aceitável na gramática.

- Classe [Analisador Semântico](https://github.com/gabrielSpassos/mini-java-compiler/blob/master/src/main/java/com/gabrielspassos/poc/AnalisadorSemantico.java) verifica se as regras semânticas estão sendo respeitadas. Ou seja, esse analisador verifica que não há uma operação com variável booleana. 

- Classe [GeradorByteCode](https://github.com/gabrielSpassos/mini-java-compiler/blob/master/src/main/java/com/gabrielspassos/poc/GeradorByteCode.java) gera o bytecode usando o comando javac sum.java, após todas as outras análises retornarem true. (sum.java é o nome do arquivo utilizado para teste).

Link para o passo a passo para compilar e executar o programa na IDEA IntelliJ: https://docs.google.com/document/d/1ZI2GN-MpTqKofs3Mxk1MG7gY_C-gjh0ZHBbil95WlHs/edit?usp=sharing

Link para a apresentação do PowerPoint (Léxico): https://docs.google.com/presentation/d/1gFA5dHvlKEqgsOeqg8Wced-rapL93c4lj_dzXj-fIeI/edit?usp=sharing
