// Generated from C:/Users/jaldo/IdeaProjects/8S_LYAII/src/main/java/bool/Bool.g4 by ANTLR 4.13.2
package bool;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BoolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BoolVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BoolParser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP(BoolParser.PContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoolParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(BoolParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoolParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(BoolParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code COMP}
	 * labeled alternative in {@link BoolParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCOMP(BoolParser.COMPContext ctx);
}