// Generated from C:/Users/jaldo/IdeaProjects/8S_LYAII/src/main/java/attributes/Attributes.g4 by ANTLR 4.13.2
package attributes;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AttributesParser}.
 */
public interface AttributesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AttributesParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(AttributesParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link AttributesParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(AttributesParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link AttributesParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(AttributesParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link AttributesParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(AttributesParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link AttributesParser#com}.
	 * @param ctx the parse tree
	 */
	void enterCom(AttributesParser.ComContext ctx);
	/**
	 * Exit a parse tree produced by {@link AttributesParser#com}.
	 * @param ctx the parse tree
	 */
	void exitCom(AttributesParser.ComContext ctx);
	/**
	 * Enter a parse tree produced by {@link AttributesParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(AttributesParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link AttributesParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(AttributesParser.TermContext ctx);
}