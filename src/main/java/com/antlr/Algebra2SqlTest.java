package com.antlr;

import algebraOut.RelationlAlgebraLexer;
import algebraOut.RelationlAlgebraParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileInputStream;

import java.io.InputStream;

/**
 * @author 周飞
 * @date 2018/12/27 19:42
 */
public class Algebra2SqlTest {
    public static void main(String[] args) throws Exception {
        // Create an input character stream from standard in
        //用文件输入
//        String inputFile = "C:\\Users\\76165\\Desktop\\myantlr\\src\\main\\java\\com\\antlr/input.txt";
//        InputStream input1 = new FileInputStream(inputFile);
//        ANTLRInputStream input = new ANTLRInputStream(input1);
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        // Create an ExprLexer that feeds from that stream
        algebraOut.RelationlAlgebraLexer lexer = new RelationlAlgebraLexer(input);
        // Create a stream of tokens fed by the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Create a parser that feeds off the token stream
        algebraOut.RelationlAlgebraParser parser = new RelationlAlgebraParser(tokens);
        // Begin parsing at rule expr
        ParseTree tree = parser.prog();
        Algebra2SqlVisitor algebra = new Algebra2SqlVisitor();
        for(RelationlAlgebraParser.StartContext sctx:((RelationlAlgebraParser.ProgContext) tree).start()){
            System.out.println(algebra.visit(sctx));
        }
    }
}
