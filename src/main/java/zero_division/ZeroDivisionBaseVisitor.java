// Generated from C:/Users/jaldo/IdeaProjects/8S_LYAII/src/main/java/zero_division/ZeroDivision.g4 by ANTLR 4.13.2
package zero_division;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link ZeroDivisionVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
@SuppressWarnings("CheckReturnValue")
public class ZeroDivisionBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements ZeroDivisionVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitS(ZeroDivisionParser.SContext ctx) { return visitChildren(ctx); }
}