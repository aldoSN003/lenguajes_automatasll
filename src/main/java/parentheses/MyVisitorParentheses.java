package parentheses;

public class MyVisitorParentheses extends ParenthesesBaseVisitor<Integer>{
    @Override
    public Integer visitMrule(ParenthesesParser.MruleContext ctx) {
        return super.visitMrule(ctx);
    }

    @Override
    public Integer visitNested(ParenthesesParser.NestedContext ctx) {

        int countClose= ctx.CLOSE().size();
        int countOpen= ctx.OPEN().size();
        if(countOpen==countClose){
            System.out.println("CORRECTO");
            return 1;

        }else{
            System.out.println("INCORRECTO");
            return 0;
        }
    }
}
