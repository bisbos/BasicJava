package basicJava.stringstudy;

import java.util.*;

public class AnagramGrouping {

    public static void main(String[] args) {
        final String[] input = {"abc", "cat", "cba", "test", "sett", "tar", "rat", "pat", "tap", "pta"};
        Map<Integer,List<String>> outputMap = new HashMap<>();
        for (int i=0;i<input.length;i++){
            int sum = calculateTotal(input[i]);
            outputMap.computeIfAbsent(sum,t->new ArrayList<>()).add(input[i]);
        }

        Collection<List<String>> output = outputMap.values();
        for (List<String> values:output){
            System.out.println(values);
        }
    }

    private static int calculateTotal(String value){
        int total =0;
        for (int i=0;i<value.length();i++){
            total += value.charAt(i)-'0';
        }
        return total;
    }
}
