package basicJava.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

    public static void main(String[] args) {
        String sentence = "My name is Bisin";
        Pattern pattern = Pattern.compile("Bisin");
        Matcher matcher = pattern.matcher(sentence);

        boolean findFlag = matcher.find();
        System.out.println(findFlag);

        String groupString = matcher.group();
        int startPosition = matcher.start();
        int endPosition = matcher.end();

        String tempString = String.format(
                "found the text "+"\"%s\" starting at "+ "index %d and ending at index %d.%n",
                groupString,
                startPosition,
                endPosition
        );
        System.out.println(tempString);

        findFlag = sentence.matches("Bisin");
        System.out.println(findFlag);
    }
}
