import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import c_grammar.CLexer;
import c_grammar.CParser;

public class Main {
    public static void main(String[] args) throws Exception{
        CharStream input = CharStreams.fromFileName("test.txt");
        CLexer lexer = new CLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CParser parser = new CParser(tokens);
        ParseTree tree = parser.program();

        MyVisitor visitor = new MyVisitor();
        
        System.out.println(visitor.visit(tree));
    }
}
