package bool;

public class MyVisitor extends BoolBaseVisitor<Integer> {
    // este es el valor que toma nuestra variable
    private int value;
    private String id;

    @Override
    public Integer visitP(BoolParser.PContext ctx) {
        visit(ctx.var());
        return visit(ctx.cond());
    }

    @Override
    public Integer visitVar(BoolParser.VarContext ctx) {
        //parseamos el valor que se ingresa desde consola y lo asignamos a nuestra variable
        value = Integer.parseInt(ctx.INT().getText());
        id = ctx.ID().getText();
        //System.out.println(id);
        return 0;
    }

    @Override
    public Integer visitCond(BoolParser.CondContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Integer visitCOMP(BoolParser.COMPContext ctx) {
        int left = value;
        int right = Integer.parseInt(ctx.INT().getText());
        String compId = ctx.ID().getText();
        if (compId == id) {
            switch (ctx.op.getText()) {
                case ">":
                    return left > right ? 1 : 0;
                case "<":
                    return left < right ? 1 : 0;
                case "==":
                    return left == right ? 1 : 0;
            }
        } else {

            return 2;
        }

return 0;
    }
}
