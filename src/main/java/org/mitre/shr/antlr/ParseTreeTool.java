package org.mitre.shr.antlr;

import org.antlr.v4.runtime.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
* A simple wrapper around the ANTLR4 testrig.
*/
public class ParseTreeTool {
    public static void main(String[] args) throws IOException {
        String inputFile = null;
        if (args.length > 0) {
            inputFile = args[0];
        }
        InputStream is = System.in;
        if (inputFile != null) {
            is = new FileInputStream(inputFile);
        }
        ANTLRInputStream input = new ANTLRInputStream(is);
        Lexer lexer = ParseTool.getLexer(inputFile, input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();
        Parser parser = ParseTool.getParser(inputFile, tokens);
        parser.setBuildParseTree(true);
        ParserRuleContext tree;
        if (parser instanceof SHRDataElementParser) {
            tree = ((SHRDataElementParser) parser).doc();
        } else if (parser instanceof SHRValueSetParser) {
            tree = ((SHRValueSetParser) parser).doc();
        } else if (parser instanceof SHRMapParser) {
            tree = ((SHRMapParser) parser).doc();
        } else {
            throw new RuntimeException("Unrecognized Parser");
        }
        tree.inspect(parser);
    }
}
