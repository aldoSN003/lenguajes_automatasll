// Generated from C:/Users/jaldo/IdeaProjects/8S_LYAII/src/main/java/count_int/CountInt.g4 by ANTLR 4.13.2
package count_int;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link CountIntVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
@SuppressWarnings("CheckReturnValue")
public class CountIntBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements CountIntVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitS(CountIntParser.SContext ctx) { return visitChildren(ctx); }
}