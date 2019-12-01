// Generated from Gramatica.g4 by ANTLR 4.7.2

	import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GramaticaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GramaticaParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(GramaticaParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(GramaticaParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#etDeclaracao_Variaveis}.
	 * @param ctx the parse tree
	 */
	void enterEtDeclaracao_Variaveis(GramaticaParser.EtDeclaracao_VariaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#etDeclaracao_Variaveis}.
	 * @param ctx the parse tree
	 */
	void exitEtDeclaracao_Variaveis(GramaticaParser.EtDeclaracao_VariaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declara_procedimento}.
	 * @param ctx the parse tree
	 */
	void enterDeclara_procedimento(GramaticaParser.Declara_procedimentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declara_procedimento}.
	 * @param ctx the parse tree
	 */
	void exitDeclara_procedimento(GramaticaParser.Declara_procedimentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declara_funcao}.
	 * @param ctx the parse tree
	 */
	void enterDeclara_funcao(GramaticaParser.Declara_funcaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declara_funcao}.
	 * @param ctx the parse tree
	 */
	void exitDeclara_funcao(GramaticaParser.Declara_funcaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declaracao_var}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_var(GramaticaParser.Declaracao_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declaracao_var}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_var(GramaticaParser.Declaracao_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(GramaticaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(GramaticaParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#etsub_rotina}.
	 * @param ctx the parse tree
	 */
	void enterEtsub_rotina(GramaticaParser.Etsub_rotinaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#etsub_rotina}.
	 * @param ctx the parse tree
	 */
	void exitEtsub_rotina(GramaticaParser.Etsub_rotinaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(GramaticaParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(GramaticaParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(GramaticaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(GramaticaParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#atribuicao_chprocedimento}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao_chprocedimento(GramaticaParser.Atribuicao_chprocedimentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#atribuicao_chprocedimento}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao_chprocedimento(GramaticaParser.Atribuicao_chprocedimentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comando_atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterComando_atribuicao(GramaticaParser.Comando_atribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comando_atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitComando_atribuicao(GramaticaParser.Comando_atribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#chamada_procedimento}.
	 * @param ctx the parse tree
	 */
	void enterChamada_procedimento(GramaticaParser.Chamada_procedimentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#chamada_procedimento}.
	 * @param ctx the parse tree
	 */
	void exitChamada_procedimento(GramaticaParser.Chamada_procedimentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comando_condicional}.
	 * @param ctx the parse tree
	 */
	void enterComando_condicional(GramaticaParser.Comando_condicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comando_condicional}.
	 * @param ctx the parse tree
	 */
	void exitComando_condicional(GramaticaParser.Comando_condicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comando_enquanto}.
	 * @param ctx the parse tree
	 */
	void enterComando_enquanto(GramaticaParser.Comando_enquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comando_enquanto}.
	 * @param ctx the parse tree
	 */
	void exitComando_enquanto(GramaticaParser.Comando_enquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comando_leia}.
	 * @param ctx the parse tree
	 */
	void enterComando_leia(GramaticaParser.Comando_leiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comando_leia}.
	 * @param ctx the parse tree
	 */
	void exitComando_leia(GramaticaParser.Comando_leiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comando_escreva}.
	 * @param ctx the parse tree
	 */
	void enterComando_escreva(GramaticaParser.Comando_escrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comando_escreva}.
	 * @param ctx the parse tree
	 */
	void exitComando_escreva(GramaticaParser.Comando_escrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(GramaticaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(GramaticaParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#operador_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOperador_relacional(GramaticaParser.Operador_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#operador_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOperador_relacional(GramaticaParser.Operador_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressao_simples}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_simples(GramaticaParser.Expressao_simplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressao_simples}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_simples(GramaticaParser.Expressao_simplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(GramaticaParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(GramaticaParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(GramaticaParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(GramaticaParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(GramaticaParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(GramaticaParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#chamada_funcao}.
	 * @param ctx the parse tree
	 */
	void enterChamada_funcao(GramaticaParser.Chamada_funcaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#chamada_funcao}.
	 * @param ctx the parse tree
	 */
	void exitChamada_funcao(GramaticaParser.Chamada_funcaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(GramaticaParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(GramaticaParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(GramaticaParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(GramaticaParser.NumeroContext ctx);
}