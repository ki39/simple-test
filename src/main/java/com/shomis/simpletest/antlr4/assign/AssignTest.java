package com.shomis.simpletest.antlr4.assign;

import java.io.IOException;

import com.shomis.simpletest.antlr4.assign.AssignParser.AssignContext;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class AssignTest {

    public static void main(String[] args) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream("a = 1;");

        AssignLexer lexer = new AssignLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        AssignParser parser = new AssignParser(tokens);

        AssignContext assign = parser.assign();

        AssignBaseVisitor<Object> visitor = new AssignBaseVisitor<>();
        Object o = visitor.visitAssign(assign);
        System.out.println(o);

    }
}
