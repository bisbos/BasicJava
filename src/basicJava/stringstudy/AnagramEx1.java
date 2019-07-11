package basicJava.stringstudy;

import java.util.HashMap;
import java.util.Map;

public class AnagramEx1 {

    public static void main(String[] args){
        String word1 = "eat";
        String word2 = "ate";

        boolean flag = checkAnagram(word1,word2);
        if (flag){
            System.out.print("Anagram");
        }else{
            System.out.print("Not Anagram");
        }

    }

    public static boolean checkAnagram(String word1,String word2){
        if (word1.length()!=word2.length()){
            return false;
        }

        Map<Character,Integer> charMap = new HashMap<Character, Integer>();

        for (int i=0;i<word1.length();i++){
            int  count = charMap.getOrDefault(word1.charAt(i),0);
            charMap.put(word1.charAt(i),++count);
        }


        for (int i=0;i<word2.length();i++){
            int count = charMap.getOrDefault(word2.charAt(i),0);
            charMap.put(word2.charAt(i),--count);
        }

        for (Integer value:charMap.values()){
            if (value!=0){
                return false;
            }
        }

        return true;
    }
}
