// Generated from C:/Users/jaldo/IdeaProjects/8S_LYAII/src/main/java/boolSum/BoolSum.g4 by ANTLR 4.13.2
package boolSum;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BoolSumParser}.
 */
public interface BoolSumListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BoolSumParser#p}.
	 * @param ctx the parse tree
	 */
	void enterP(BoolSumParser.PContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoolSumParser#p}.
	 * @param ctx the parse tree
	 */
	void exitP(BoolSumParser.PContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoolSumParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(BoolSumParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoolSumParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(BoolSumParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoolSumParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(BoolSumParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoolSumParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(BoolSumParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COMP}
	 * labeled alternative in {@link BoolSumParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCOMP(BoolSumParser.COMPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COMP}
	 * labeled alternative in {@link BoolSumParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCOMP(BoolSumParser.COMPContext ctx);
}