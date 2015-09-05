package kg.ash.javavi.readers.source;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseException;
import com.github.javaparser.TokenMgrError;
import com.github.javaparser.ast.CompilationUnit;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.io.StringReader;

public class CompilationUnitCreator {

    public static CompilationUnit createFromFile(String fileName) {
        try {
            return JavaParser.parse(new FileReader(fileName), true);
        } catch (TokenMgrError | ParseException | FileNotFoundException e) {
            return null;
        }
    }

    public static CompilationUnit createFromContent(String content) {
        try {
            return JavaParser.parse(new StringReader(content), true);
        } catch (TokenMgrError | ParseException e) {
            return null;
        }
    }
    
}
