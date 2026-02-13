package abc;

public class MyVisitorAbc extends AbcBaseVisitor<Integer> {
    @Override
    public Integer visitMrule(AbcParser.MruleContext ctx) {
  //      int count = ctx.LETTER().size();
//        System.out.println("Letter count: ");
//        return count;
      if (ctx.children.contains(ctx.SEMICOLON())){
          int count = ctx.LETTER().size();
          System.out.println("Letter count: ");
          return count;
      }else {
          System.out.println("missing ';' at the end of the expression");
          return 0;
      }
    }
}
