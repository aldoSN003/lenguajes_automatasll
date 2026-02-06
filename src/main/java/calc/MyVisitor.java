package calc;

public class MyVisitor extends CalcBaseVisitor<Integer> {

    @Override
    public Integer visitP(CalcParser.PContext ctx) {
        return visit(ctx.exp());
    }

    @Override
    public Integer visitPA(CalcParser.PAContext ctx) {
        return visit(ctx.exp());
    }

    @Override
    public Integer visitNUM(CalcParser.NUMContext ctx) {
        return Integer.parseInt(ctx.INT().getText()) ;
    }

    @Override
    public Integer visitMD(CalcParser.MDContext ctx) {
        int left = visit(ctx.exp(0));
        int right = visit(ctx.exp(1));
        if (ctx.op.getText().equals("*")) {
            return left * right;

        } else {
            return left / right;
        }
    }

    @Override
    public Integer visitSR(CalcParser.SRContext ctx) {
        int left = visit(ctx.exp(0));
        int right = visit(ctx.exp(1));
        if (ctx.op.getText().equals("+")) {
            return left + right;

        } else {
            return left - right;
        }

    }


}
