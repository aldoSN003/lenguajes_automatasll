// Generated from C:/Users/jaldo/IdeaProjects/8S_LYAII/src/main/java/variables_attributes/VariablesAttributes.g4 by ANTLR 4.13.2
package variables_attributes;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VariablesAttributesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VariablesAttributesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VariablesAttributesParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(VariablesAttributesParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link VariablesAttributesParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(VariablesAttributesParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link VariablesAttributesParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(VariablesAttributesParser.ValorContext ctx);
}