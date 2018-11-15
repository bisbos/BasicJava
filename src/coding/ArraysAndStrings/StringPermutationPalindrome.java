package coding.ArraysAndStrings;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Given a string, check if one of the permutation of String is Palindrome
 *
 * Solution : Either all characters are even or Check only one character is odd
 */
public class StringPermutationPalindrome {

    public static void main(String[] args) {

        StringPermutationPalindrome permutationPalindrome = new StringPermutationPalindrome();
        String value = "abba";
        System.out.println(permutationPalindrome.isPermPalindrome(value));

        value = "abbc";
        System.out.println(permutationPalindrome.isPermPalindrome(value));

        value = "yalamalam";
        System.out.println(permutationPalindrome.isPermPalindrome(value));

        value = "hindi";
        System.out.println(permutationPalindrome.isPermPalindrome(value));
    }

    public boolean isPermPalindrome(String value){
        Map<Character,Integer> countCharactersMap = new HashMap<>();
        for (int i=0;i<value.length();i++){
            int count =0;
            if (countCharactersMap.get(value.charAt(i))!=null){
                count = countCharactersMap.get(value.charAt(i));
                countCharactersMap.put(value.charAt(i),++count);
            }else {
                countCharactersMap.put(value.charAt(i),++count);
            }
        }
        return checkOddCount(countCharactersMap);
    }

    public boolean checkOddCount(Map<Character,Integer> countCharactersMap){
        int oddCount =0;
        for (Integer value:countCharactersMap.values()){
            if (value%2!=0)
                oddCount++;
        }
        if (oddCount>1)
            return false;
        else
            return true;
    }
}
