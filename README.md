# Mini Java Compiler - Compiladores Grau A

Projeto para realizar a compilação de um arquivo escrito na linguagem [Minijava](http://www.cambridge.org/us/features/052182060X/). O trabalho foi realizado pelos seguintes alunos:

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

Considerações:

Inicialmente, optou-se por utilizar a abordagem Minijava para este trabalho, assim como realizado no trabalho do Grau A. 

Devido à complexidade dessa construção, porém, começamos a fazer a implementação usando a ferramenta ANTLR. Contudo, não foi possível construir o compilador nessa ferramenta em função de um erro de versão que não conseguimos resolver. Mesmo assim, foi possível completar a implementação do analisador léxico no ANTLR e parte do analisador sintático, e a construção da gramática pode ser avaliada usando a ferramenta ANTLR (Pasta ANTRL_RR).

A partir dessas dificuldades, concluímos a implementação dos analisadores sintático e semântico usando Minijava, porém com uma implementação simplificada, buscando garantir seu funcionamento. 

Além disso, é necessário fazer as seguintes observações:
- As seguintes declarações não são aceitas: "5 + 3 - 8" e "a = 3 + 2"
- O nome do arquivo gerado pelo gerador de bytecode é o nome da classe principal do arquivo testado
- O Javac é possível executar no Linux, porém não funcionou quando rodamos nosso compilador

Link para o passo a passo para compilar e executar o programa na IDEA IntelliJ: https://docs.google.com/document/d/1ZI2GN-MpTqKofs3Mxk1MG7gY_C-gjh0ZHBbil95WlHs/edit?usp=sharing

Link para a apresentação do PowerPoint: https://docs.google.com/presentation/d/1gFA5dHvlKEqgsOeqg8Wced-rapL93c4lj_dzXj-fIeI/edit?usp=sharing
