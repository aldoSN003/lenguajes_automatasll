// Generated from C:/Users/jaldo/IdeaProjects/8S_LYAII/src/main/java/zero_division/ZeroDivision.g4 by ANTLR 4.13.2
package zero_division;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ZeroDivisionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ZeroDivisionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ZeroDivisionParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(ZeroDivisionParser.SContext ctx);
}