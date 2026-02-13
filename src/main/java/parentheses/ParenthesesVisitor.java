// Generated from C:/Users/jaldo/IdeaProjects/8S_LYAII/src/main/java/parentheses/Parentheses.g4 by ANTLR 4.13.2
package parentheses;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParenthesesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParenthesesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParenthesesParser#mrule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMrule(ParenthesesParser.MruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParenthesesParser#nested}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested(ParenthesesParser.NestedContext ctx);
}