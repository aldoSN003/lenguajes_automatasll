package boolSum;

public class MyVisitor extends BoolSumBaseVisitor<Integer> {
    // este es el valor que toma nuestra variable
    private int value;
    private String id;

    @Override
    public Integer visitP(BoolSumParser.PContext ctx) {
        visit(ctx.var());
        return visit(ctx.cond());
    }

    @Override
    public Integer visitVar(BoolSumParser.VarContext ctx) {
        //parseamos el valor que se ingresa desde consola y lo asignamos a nuestra variable
        value = Integer.parseInt(ctx.INT().getText());
        id = ctx.ID().getText();
        //System.out.println(id);
        return 0;
    }

    @Override
    public Integer visitCond(BoolSumParser.CondContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Integer visitCOMP(BoolSumParser.COMPContext ctx) {
        int left = value;
        int right = Integer.parseInt(ctx.INT().getText());
        String compId = ctx.ID().getText();
        if (compId.equals(id)) {
            switch (ctx.op.getText()) {
                case ">":
                    if (left > right) {
                        System.out.println(left + " + " + right + " = " + (left + right));
                        return 1;
                    }
                    return 0;
                case "<":
                    if (left < right) {
                        System.out.println(left + " + " + right + " = " + (left + right));
                        return 1;
                    }
                    return 0;
                case "==":
                    if (left == right) {
                        System.out.println(left + " + " + right + " = " + (left + right));
                        return 1;
                    }
                    return 0;
                default:
                    throw new RuntimeException("Operador desconocido" + ctx.op.getText());
            }
        }
        else {

            return 2;
        }


    }
}
