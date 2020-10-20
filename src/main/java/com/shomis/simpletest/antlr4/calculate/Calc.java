package com.shomis.simpletest.antlr4.calculate;

import com.shomis.simpletest.antlr4.calculate.CalculateParser.ProgContext;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Calc {

    public static void main(String[] args) {
        CharStream input = CharStreams.fromString("a=2*(3+4)-5\nb=2\na+b\n");
        // 词法分析->Token流->生成语法分析器对象

        CalculateLexer lexer = new CalculateLexer(input);

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        CalculateParser parser = new CalculateParser(tokenStream);

        ProgContext prog = parser.prog();

        EvalVisitor visitor = new EvalVisitor();

        visitor.visit(prog);


    }
}
