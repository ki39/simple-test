package com.shomis.simpletest.antlr4.ys;


import com.google.gson.JsonObject;
import com.shomis.simpletest.antlr4.ys.YsParser.Return_statementContext;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Antlr4Tester {
    public static void main(String[] args) {
        CharStream input = CharStreams.fromString("return (([车速]*10+3)>(200)) && ([企业ID] == \"123\") && ([时间]>1200 &&"
            + " [时间]<1700);");
        YsLexer lexer=new YsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        YsParser parser = new YsParser(tokens);
        Return_statementContext return_statementContext = parser.return_statement();

        YsParserBaseVisitor<JsonObject> visitor = new YsParserBaseVisitor<>();
        JsonObject o = visitor.visit(return_statementContext);

        System.out.println("");
        System.out.println(o);
        System.out.println(return_statementContext.toStringTree(parser));
    }

}
