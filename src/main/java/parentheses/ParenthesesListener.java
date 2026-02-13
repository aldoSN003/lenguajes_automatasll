// Generated from C:/Users/jaldo/IdeaProjects/8S_LYAII/src/main/java/parentheses/Parentheses.g4 by ANTLR 4.13.2
package parentheses;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParenthesesParser}.
 */
public interface ParenthesesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParenthesesParser#mrule}.
	 * @param ctx the parse tree
	 */
	void enterMrule(ParenthesesParser.MruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParenthesesParser#mrule}.
	 * @param ctx the parse tree
	 */
	void exitMrule(ParenthesesParser.MruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParenthesesParser#nested}.
	 * @param ctx the parse tree
	 */
	void enterNested(ParenthesesParser.NestedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParenthesesParser#nested}.
	 * @param ctx the parse tree
	 */
	void exitNested(ParenthesesParser.NestedContext ctx);
}