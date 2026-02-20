import count_int.CountIntLexer;
import count_int.CountIntParser;
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
            CountIntLexer lexer = new CountIntLexer(inputStream);

            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CountIntParser parser = new CountIntParser(tokens);


            ParseTree tree = parser.s(); // cambia "rule" por tu regla inicial
           // MyVisitorCountInt visitor = new MyVisitorCountInt();
         //Integer resultado = visitor.visit(tree);
        // System.out.println(resultado);
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
