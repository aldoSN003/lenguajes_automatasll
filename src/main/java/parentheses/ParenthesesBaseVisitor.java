// Generated from C:/Users/jaldo/IdeaProjects/8S_LYAII/src/main/java/parentheses/Parentheses.g4 by ANTLR 4.13.2
package parentheses;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link ParenthesesVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
@SuppressWarnings("CheckReturnValue")
public class ParenthesesBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements ParenthesesVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMrule(ParenthesesParser.MruleContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitNested(ParenthesesParser.NestedContext ctx) { return visitChildren(ctx); }
}