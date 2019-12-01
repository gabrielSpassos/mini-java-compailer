grammar Gramatica;

@header{
	import java.util.HashMap;
}

@parser::members{
	private mapaVar = new java.util.HashMap<String, String>();
	
}

@lexer::members{
}


prog		: T_PROGRAMA identificador 
			  T_PONTOEVIRGULA bloco 
			  T_FIM ;

bloco		: ( etDeclaracao_Variaveis )* 
			  comandos ;



// Declaracoes
etDeclaracao_Variaveis	: T_VAR	declaracao_var T_PONTOEVIRGULA 
						  ( declaracao_var T_PONTOEVIRGULA )* (T_PONTOEVIRGULA)? ;

declara_procedimento	: T_PROCEDIMENTO identificador 
						  T_PONTOEVIRGULA bloco ;

declara_funcao	: T_FUNCAO identificador 
				  T_DOISPONTOS tipo 
				  T_PONTOEVIRGULA bloco ;

declaracao_var : identificador {mapaVar.put(LT.(0).getText(), LT(0).getText() );} 
			     (T_VIRGULA identificador {mapaVar.put(LT.(0).getText(), LT(0).getText() );} )* 
			     T_DOISPONTOS tipo 
			     ;

tipo	: ( T_INTEIRO | T_BOOLEANO ) ;

etsub_rotina	: (declara_procedimento T_PONTOEVIRGULA | declara_funcao T_PONTOEVIRGULA ) 
				  (declara_procedimento T_PONTOEVIRGULA | declara_funcao T_PONTOEVIRGULA )* 
				  ;


//Comandos
comandos	: T_INICIOCOMANDO comando 
			  ( T_PONTOEVIRGULA comando )* 
			  (T_PONTOEVIRGULA)? ;

comando		:	( comando_escreva 
	            | comando_condicional 
	            | comando_enquanto 
	            | comando_leia 
	            | atribuicao_chprocedimento 
	            | comandos) 
	            ;

atribuicao_chprocedimento	: ( comando_atribuicao 
	                        | chamada_procedimento) 
	                        ;

comando_atribuicao	: identificador 
					  T_ATRIBUICAO expressao 
					  ;

chamada_procedimento	:	identificador ;

comando_condicional	: T_SE expressao 
					  T_ENTAO comando 
					  ( T_SENAO comando )? ;

comando_enquanto	: T_ENQUANTO expressao 
					  T_FACA comando ;

comando_leia : T_LEIA T_ABREPARENTESES (identificador { if (mapaVar.get(LT(0).getText()) == null){
													  		throw new RuntimeException("ID nao declarado")
													  }; } 	
             ) T_FECHAPARENTESES 
             ;

comando_escreva: T_ESCREVA T_ABREPARENTESES ( identificador 
	             | numero 
	             | expressao_simples
                 ) T_FECHAPARENTESES;


//EXPRESSÕES
expressao	: expressao_simples ( operador_relacional expressao_simples )? ;

operador_relacional : ( T_DIFERENCA | T_IGUAL | T_MENOR | T_MAIOR | T_MAIORIGUAL ) ;

expressao_simples	: ( T_MAIS | T_MENOS )? termo 
					  ( ( T_MAIS | T_MENOS | T_OU ) termo )? 
					  ;

termo	: fator (( T_MULT | T_DIV | T_E ) fator)* ;

fator	: (variavel | numero | chamada_funcao | 
		  T_ABREPARENTESES expressao 
		  T_FECHAPARENTESES | T_BOOLV | T_BOOLF | T_NEGACAO fator) 
		  ;

variavel	: identificador ;

chamada_funcao	: identificador ;



//NUMEROS E IDENTIFICADORES

//texto :   T_ASPAS T_TEXTO T_ASPAS;

identificador	: T_LETRA (T_LETRA | T_DIGITO | T_UNDERLINE)* ;

numero	: T_DIGITO 
		  (T_DIGITO)? 
	      ;



/* TOKENS */

//Palavras reservadas
T_PROGRAMA		: 'programa' ;

T_INICIOCOMANDO	: 'inicio' ;

T_ASPAS	: '"' ;

T_INTEIRO		: 'inteiro' ;

T_BOOLV	: 'verdadeiro' ;

T_BOOLF	: 'falso' ;

T_NEGACAO	: 'nao' ;

T_LEIA	: 'leia' ;

T_ENQUANTO	: 'enquanto' ;

T_FACA	: 'faca' ;

T_DIFERENCA	: '<>' ;

T_IGUAL	: '=' ;

T_MENOR	: '<' ;

T_MAIOR	: '>' ;

T_MAIORIGUAL : '>=' ;

T_MULT	: '*' ;

T_DIV	: 'div' ;

T_OU	: 'ou' ;

T_E	: 'e' ;

T_MAIS	: '+' ;

T_MENOS	: '-' ;

T_PROCEDIMENTO	: 'procedimento' ;

T_SE	: 'se' ;

T_ENTAO	: 'entao' ;

T_SENAO	: 'senao' ;

T_ATRIBUICAO	: ':=' ;

T_FUNCAO		: 'funcao' ;

T_BOOLEANO		: 'booleano' ;

T_FIMCOMANDO	: 'fim' ;

T_PONTOEVIRGULA	: ';' ;

T_FIM			: 'fim.' ;
				
T_VAR			: 'var' ;
				
T_VIRGULA		: ',';
				
T_DOISPONTOS	: ':' ;

T_ABREPARENTESES : '(' ;

 T_FECHAPARENTESES : ')';

T_ESCREVA		: 'escreva'	;

T_UNDERLINE		: '_' ;

T_DIGITO		: ('0'..'9')+ ;

T_LETRA		: ('a'..'z' | 'A'..'Z')+ ;

//T_TEXTO	: ('a'..'z' | '0'..'9' | ' ' | 'A'..'Z')* ;

WS 				: [ \t\r\n]+ -> skip ;

COMMENT : '#' ~[\r\n]* '\r'? '\n' -> skip ;
