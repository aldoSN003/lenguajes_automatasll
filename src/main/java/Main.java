import csv_data.CsvDataLexer;
import csv_data.CsvDataParser;
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
            CsvDataLexer lexer = new CsvDataLexer(inputStream);

            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CsvDataParser parser = new CsvDataParser(tokens);


            ParseTree tree = parser.prule(); // cambia "rule" por tu regla inicial

            IO.println(tree.toStringTree(parser));

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
