package basicJava.stringstudy;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MaxOccuranceRepeatedWords1 {

    public static void main(String[] args) {

        String value = "Hello my name is Hello name name is hello present name my hello this my name is hello present name hello";
        MaxOccuranceRepeatedWords1 maxOccur = new MaxOccuranceRepeatedWords1();
        maxOccur.getWordCount(value);
    }

    public void getWordCount(String value){
     /*  Long count =  Arrays.stream(value.split(" ")).count();
       System.out.println(count); */

      //  Map<String,Integer> wordCount = Arrays.stream(value.split(" ")).collect(Collectors.groupingBy(word->));
    }
}
