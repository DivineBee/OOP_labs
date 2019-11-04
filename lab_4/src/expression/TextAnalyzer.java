package expression;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TextAnalyzer {
    private static final TextAnalyzer INSTANCE = new TextAnalyzer();

    private TextAnalyzer(){}

    static TextAnalyzer getInstance() {
        return INSTANCE;
    }

    void textAnalysis(String pathToFile, String nameOfFile){
        Path somePath = Paths.get(pathToFile, nameOfFile);

        Charset charset = StandardCharsets.ISO_8859_1;
        try {
            List<String> brackets = new ArrayList<String>();
            List<String> lines = Files.readAllLines(somePath, charset);

            for (String line : lines) {
                System.out.println(line);
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == '(')
                        brackets.add("(");
                    if (line.charAt(i) == ')')
                        brackets.remove("(");
                }

                if(brackets.isEmpty())
                    System.out.println("All brackets are closed");
                else
                    System.out.println("Some are not closed");

                while(!brackets.isEmpty()){
                    brackets.remove("(");
                }
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}