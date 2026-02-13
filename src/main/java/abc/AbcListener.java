// Generated from C:/Users/jaldo/IdeaProjects/8S_LYAII/src/main/java/abc/Abc.g4 by ANTLR 4.13.2
package abc;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AbcParser}.
 */
public interface AbcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AbcParser#mrule}.
	 * @param ctx the parse tree
	 */
	void enterMrule(AbcParser.MruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbcParser#mrule}.
	 * @param ctx the parse tree
	 */
	void exitMrule(AbcParser.MruleContext ctx);
}