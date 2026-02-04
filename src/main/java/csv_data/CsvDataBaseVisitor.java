// Generated from C:/Users/jaldo/IdeaProjects/8S_LYAII/src/main/java/csv_data/CsvData.g4 by ANTLR 4.13.2
package csv_data;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link CsvDataVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
@SuppressWarnings("CheckReturnValue")
public class CsvDataBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements CsvDataVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPrule(CsvDataParser.PruleContext ctx) { return visitChildren(ctx); }
}