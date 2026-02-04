// Generated from C:/Users/jaldo/IdeaProjects/8S_LYAII/src/main/java/csv_data/CsvData.g4 by ANTLR 4.13.2
package csv_data;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CsvDataParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CsvDataVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CsvDataParser#prule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrule(CsvDataParser.PruleContext ctx);
}