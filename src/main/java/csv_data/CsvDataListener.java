// Generated from C:/Users/jaldo/IdeaProjects/8S_LYAII/src/main/java/csv_data/CsvData.g4 by ANTLR 4.13.2
package csv_data;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CsvDataParser}.
 */
public interface CsvDataListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CsvDataParser#prule}.
	 * @param ctx the parse tree
	 */
	void enterPrule(CsvDataParser.PruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvDataParser#prule}.
	 * @param ctx the parse tree
	 */
	void exitPrule(CsvDataParser.PruleContext ctx);
}