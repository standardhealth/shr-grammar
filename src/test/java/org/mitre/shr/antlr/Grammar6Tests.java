package org.mitre.shr.antlr;

import org.antlr.v4.runtime.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * A simple wrapper around the ANTLR4 parser that will print parse errors to the console.
 */
public class Grammar6Tests {

    @Test
    public void testCodeSystemFail() {
        String[] errors = parsePath("CodeSystemFail/test.txt");
        assertThat(errors, is(arrayWithSize(1)));
        assertThat(errors[0], startsWith("mismatched input 'www.link.com'"));

        errors = parsePath("CodeSystemFail/test_2.txt");
        assertThat(errors, is(arrayWithSize(1)));
        assertThat(errors[0], startsWith("mismatched input 'is'"));

        errors = parsePath("CodeSystemFail/test_3.txt");
        assertThat(errors, is(arrayWithSize(1)));
        assertThat(errors[0], startsWith("mismatched input 'link.com'"));

        errors = parsePath("CodeSystemFail/test_3.txt");
        assertThat(errors, is(arrayWithSize(1)));
        assertThat(errors[0], startsWith("mismatched input 'link.com'"));

        errors = parsePath("CodeSystemFail/test_4.txt");
        assertThat(errors, is(arrayWithSize(2)));
        assertThat(errors[0], startsWith("token recognition error at: '?'"));
        assertThat(errors[1], startsWith("extraneous input ':'"));

        errors = parsePath("CodeSystemFail/test_5.txt");
        assertThat(errors, is(arrayWithSize(1)));
        assertThat(errors[0], startsWith("mismatched input 'abcd'"));

        errors = parsePath("CodeSystemFail/test_6.txt");
        assertThat(errors, is(arrayWithSize(1)));
        assertThat(errors[0], startsWith("mismatched input 'Abcd'"));

        errors = parsePath("CodeSystemFail/test_7.txt");
        assertThat(errors, is(arrayWithSize(1)));
        assertThat(errors[0], startsWith("mismatched input 'url'"));

        errors = parsePath("CodeSystemFail/test_8.txt");
        assertThat(errors, is(arrayWithSize(2)));
        assertThat(errors[0], startsWith("extraneous input 'Uses:'"));
        assertThat(errors[1], startsWith("mismatched input 'www.link.com'"));
    }

    @Test
    public void testCodeSystemPass() {
        String[] errors = parsePath("CodeSystemPass");
        assertThat(errors, is(emptyArray()));
    }

    private String[] parsePath(String stringPath) {
        Path path;
        try {
            path = Paths.get(ClassLoader.getSystemResource(stringPath).toURI());
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

        MessageCollectingErrorListener errorListener = new MessageCollectingErrorListener();
        if (path.toFile().isDirectory()) {
            this.parseDirectory(path, errorListener);
        } else {
            this.parseFile(path, errorListener);
        }

        return errorListener.getErrors();
    }

    private void parseDirectory(Path path, MessageCollectingErrorListener errorListener) {
        try {
            Files.walk(path).forEach((p) -> this.parseFile(p, errorListener));
        } catch (IOException e) {
            errorListener.addError(e.getMessage());
        }
    }

    private void parseFile(Path path, MessageCollectingErrorListener errorListener) {
        if (path.toFile().isDirectory()) {
            return;
        }

        // Only support text files
        if (!path.toString().endsWith(".txt")) {
            return;
        }

        try {
            InputStream is = Files.newInputStream(path, StandardOpenOption.READ);
            ANTLRInputStream input = new ANTLRInputStream(is);
            Lexer lexer = this.getLexer(path.toString(), input);
            lexer.removeErrorListeners();
            lexer.addErrorListener(errorListener);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            tokens.fill();
            Parser parser = this.getParser(path.toString(), tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);
            parser.setBuildParseTree(true);
            if (parser instanceof SHRDataElementParser) {
                ((SHRDataElementParser) parser).doc();
            } else if (parser instanceof SHRValueSetParser) {
                ((SHRValueSetParser) parser).doc();
            } else if (parser instanceof SHRMapParser) {
                ((SHRMapParser) parser).doc();
            } else {
                throw new RuntimeException("Unrecognized Parser");
            }
        } catch (IOException e) {
            errorListener.addError(e.getMessage());
        }

    }

    public Lexer getLexer(String path, ANTLRInputStream input) {
        // Poor man's approach to content type detection
        if (path.endsWith("_vs.txt")) {
            return new SHRValueSetLexer(input);
        } else if (path.endsWith("_map.txt")) {
            return new SHRMapLexer(input);
        }
        return new SHRDataElementLexer(input);
    }

    public Parser getParser(String path, CommonTokenStream tokens) {
        // Poor man's approach to content type detection
        if (path.endsWith("_vs.txt")) {
            return new SHRValueSetParser(tokens);
        } else if (path.endsWith("_map.txt")) {
            return new SHRMapParser(tokens);
        }
        return new SHRDataElementParser(tokens);
    }

    /**
     * A simple ANTLR ErrorListener to collect errors that were detected so that tests can check against them
     */
    private static class MessageCollectingErrorListener extends BaseErrorListener {
        private ArrayList<String> errors = new ArrayList<String>();

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
            this.addError(msg);
        }

        public void addError(String message) {
            this.errors.add(message);
        }

        public String[] getErrors() {
            return errors.toArray(new String[this.errors.size()]);
        }
    }
}