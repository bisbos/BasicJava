package coding.ArraysAndStrings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringPermutation {

    public static void main(String[] args) {

        String word = "abc";
        StringPermutation permutation = new StringPermutation();
        permutation.doPermutation(" ",word);
    }

    public void doPermutation(String perm,String word){
        if (word.isEmpty())
            System.out.println(perm+word);
        else {
            for (int i = 0; i < word.length(); i++) {

                System.out.println("Perm : "+ perm + word.charAt(i)+ " Word : "+ word.substring(0,i)+" "+ word.substring((i+1)));

                doPermutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1));
            }
        }
    }

}
