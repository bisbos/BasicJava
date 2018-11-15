package dataStructures.recursions;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {

    public static void main(String[] args) {

        List<String> permutations = new StringPermutation().getPermutation(" ","abc");
        permutations.stream().forEach(System.out::println);
    }

    List<String> stringPermutations = new ArrayList<>();
    public List<String> getPermutation(String prefix,String value){
        if (value.length()==0){
            stringPermutations.add(prefix);
        }else {
            for (int i=0;i<value.length();i++){
                getPermutation(prefix+value.charAt(i),value.substring(0,i)+value.substring(i+1));
            }
        }
        return stringPermutations;
    }
}
