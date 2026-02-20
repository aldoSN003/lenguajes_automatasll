// Generated from C:/Users/jaldo/IdeaProjects/8S_LYAII/src/main/java/variables_attributes/VariablesAttributes.g4 by ANTLR 4.13.2
package variables_attributes;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VariablesAttributesParser}.
 */
public interface VariablesAttributesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VariablesAttributesParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(VariablesAttributesParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link VariablesAttributesParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(VariablesAttributesParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link VariablesAttributesParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(VariablesAttributesParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link VariablesAttributesParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(VariablesAttributesParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link VariablesAttributesParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(VariablesAttributesParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VariablesAttributesParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(VariablesAttributesParser.ValorContext ctx);
}