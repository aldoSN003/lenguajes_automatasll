// Generated from C:/Users/jaldo/IdeaProjects/8S_LYAII/src/main/java/parentheses_attributes/ParenthesesAttributes.g4 by ANTLR 4.13.2
package parentheses_attributes;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParenthesesAttributesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParenthesesAttributesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParenthesesAttributesParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(ParenthesesAttributesParser.SContext ctx);
}