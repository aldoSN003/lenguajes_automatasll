// Generated from C:/Users/jaldo/IdeaProjects/8S_LYAII/src/main/java/calc/Calc.g4 by ANTLR 4.13.2
package calc;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcParser}.
 */
public interface CalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcParser#p}.
	 * @param ctx the parse tree
	 */
	void enterP(CalcParser.PContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#p}.
	 * @param ctx the parse tree
	 */
	void exitP(CalcParser.PContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PA}
	 * labeled alternative in {@link CalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterPA(CalcParser.PAContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PA}
	 * labeled alternative in {@link CalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitPA(CalcParser.PAContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NUM}
	 * labeled alternative in {@link CalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNUM(CalcParser.NUMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NUM}
	 * labeled alternative in {@link CalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNUM(CalcParser.NUMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MD}
	 * labeled alternative in {@link CalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMD(CalcParser.MDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MD}
	 * labeled alternative in {@link CalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMD(CalcParser.MDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SR}
	 * labeled alternative in {@link CalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSR(CalcParser.SRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SR}
	 * labeled alternative in {@link CalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSR(CalcParser.SRContext ctx);
}