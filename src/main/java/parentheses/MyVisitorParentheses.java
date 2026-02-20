package parentheses;

public class MyVisitorParentheses extends ParenthesesBaseVisitor<Integer> {

    @Override
    public Integer visitMrule(ParenthesesParser.MruleContext ctx) {

        // Detect syntax errors recovered by ANTLR
        if (ctx.exception != null) {
            System.out.println("ERROR DE SINTAXIS");
            return 0;
        }

        return visit(ctx.nested());
    }

    @Override
    public Integer visitNested(ParenthesesParser.NestedContext ctx) {

        if (ctx.exception != null) {
            System.out.println("ERROR DE SINTAXIS");
            return 0;
        }

        int countOpen = ctx.OPEN().size();
        int countClose = ctx.CLOSE().size();

        if (countOpen == countClose) {
            System.out.println("CORRECTO");
            return 1;
        } else {
            System.out.println("INCORRECTO");
            return 0;
        }
    }
}