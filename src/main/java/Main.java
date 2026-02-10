import bool.BoolLexer;
import bool.BoolParser;
import calc.CalcLexer;

import calc.CalcParser;

import bool.MyVisitor;
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
            BoolLexer lexer = new BoolLexer(inputStream);

            CommonTokenStream tokens = new CommonTokenStream(lexer);
            BoolParser parser = new BoolParser(tokens);


            ParseTree tree = parser.p(); // cambia "rule" por tu regla inicial
            MyVisitor visitor = new MyVisitor();
            Integer resultado = visitor.visit(tree);
            String msg ="";
            switch (resultado) {
                case 0:
                    System.out.println("false");
                    break;
                case 1:
                    System.out.println("true");
                    break;
                case 2:
                    System.out.println("ERROR: Las variables deben coincidir");
                    break;
            }

            System.out.println(msg);

            IO.println(tree.toStringTree(parser));

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
