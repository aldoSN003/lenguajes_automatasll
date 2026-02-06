import calc.CalcLexer;

import calc.CalcParser;

import calc.MyVisitor;
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
            CalcLexer lexer = new CalcLexer(inputStream);

            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CalcParser parser = new CalcParser(tokens);


            ParseTree tree = parser.p(); // cambia "rule" por tu regla inicial
            MyVisitor visitor = new MyVisitor();
            Integer resultado = visitor.visit(tree);
            System.out.println(resultado);

            IO.println(tree.toStringTree(parser));

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
