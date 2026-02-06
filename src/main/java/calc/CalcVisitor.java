// Generated from C:/Users/jaldo/IdeaProjects/8S_LYAII/src/main/java/calc/Calc.g4 by ANTLR 4.13.2
package calc;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalcParser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP(CalcParser.PContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PA}
	 * labeled alternative in {@link CalcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPA(CalcParser.PAContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NUM}
	 * labeled alternative in {@link CalcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNUM(CalcParser.NUMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MD}
	 * labeled alternative in {@link CalcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMD(CalcParser.MDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SR}
	 * labeled alternative in {@link CalcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSR(CalcParser.SRContext ctx);
}