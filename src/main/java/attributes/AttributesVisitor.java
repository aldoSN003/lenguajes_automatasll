// Generated from C:/Users/jaldo/IdeaProjects/8S_LYAII/src/main/java/attributes/Attributes.g4 by ANTLR 4.13.2
package attributes;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AttributesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AttributesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AttributesParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(AttributesParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link AttributesParser#let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(AttributesParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by {@link AttributesParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCom(AttributesParser.ComContext ctx);
	/**
	 * Visit a parse tree produced by {@link AttributesParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(AttributesParser.TermContext ctx);
}