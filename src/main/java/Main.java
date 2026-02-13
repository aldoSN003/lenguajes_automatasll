import abc.AbcLexer;
import abc.AbcParser;
import abc.MyVisitorAbc;
import bool.BoolLexer;
import bool.BoolParser;



import boolSum.BoolSumLexer;
import boolSum.BoolSumParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

void main() {
    Scanner scanner = new Scanner(System.in);

    while (true) {
        IO.print("Ingrese una expresión (exit para salir): ");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("exit")) {
            break;
        }

        try {
            CharStream inputStream = CharStreams.fromString(input);
            AbcLexer lexer = new AbcLexer(inputStream);

            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AbcParser parser = new AbcParser(tokens);


            ParseTree tree = parser.mrule(); // cambia "rule" por tu regla inicial
            MyVisitorAbc visitor = new MyVisitorAbc();
            Integer resultado = visitor.visit(tree);
            System.out.println(resultado);
//            String msg ="";
//            switch (resultado) {
//                case 0:
//                    System.out.println("false");
//                    break;
//                case 1:
//                    System.out.println("true");
//                    break;
//                case 2:
//                    System.out.println("ERROR: Las variables deben coincidir");
//                    break;
//            }
//
//            System.out.println(msg);

            IO.println(tree.toStringTree(parser));

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
