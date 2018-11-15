package java8.lambda.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InstanceMethodwithObjRefDemo1 {

    public static void main(String[] args) {

        List<String> strings = Arrays
                .asList("how", "to", "do", "in", "java", "dot", "com");

        List<String> sortedList = strings.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
        System.out.println(sortedList);

        List<String> sortedList1=  strings.stream().sorted(String::compareTo).collect(Collectors.toList());
        System.out.println(sortedList1);
    }

}
