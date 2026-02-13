// Generated from C:/Users/jaldo/IdeaProjects/8S_LYAII/src/main/java/boolSum/BoolSum.g4 by ANTLR 4.13.2
package boolSum;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BoolSumParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BoolSumVisitor<T> extends ParseTreeVisitor<T> {

	T visitP(BoolSumParser.PContext ctx);

	T visitVar(BoolSumParser.VarContext ctx);

	T visitCond(BoolSumParser.CondContext ctx);

	T visitCOMP(BoolSumParser.COMPContext ctx);
}