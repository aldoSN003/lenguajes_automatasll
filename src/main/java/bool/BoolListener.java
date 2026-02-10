// Generated from C:/Users/jaldo/IdeaProjects/8S_LYAII/src/main/java/bool/Bool.g4 by ANTLR 4.13.2
package bool;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BoolParser}.
 */
public interface BoolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BoolParser#p}.
	 * @param ctx the parse tree
	 */
	void enterP(BoolParser.PContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoolParser#p}.
	 * @param ctx the parse tree
	 */
	void exitP(BoolParser.PContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoolParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(BoolParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoolParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(BoolParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoolParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(BoolParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoolParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(BoolParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COMP}
	 * labeled alternative in {@link BoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCOMP(BoolParser.COMPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COMP}
	 * labeled alternative in {@link BoolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCOMP(BoolParser.COMPContext ctx);
}