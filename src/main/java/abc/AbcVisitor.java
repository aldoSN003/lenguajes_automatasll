// Generated from C:/Users/jaldo/IdeaProjects/8S_LYAII/src/main/java/abc/Abc.g4 by ANTLR 4.13.2
package abc;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AbcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AbcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AbcParser#mrule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMrule(AbcParser.MruleContext ctx);
}