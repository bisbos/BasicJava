package basicJava.stringstudy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Remove minimum number of characters so that two strings become anagram
 */
public class AnagramRemoveElements {

    public static void main(String[] args){
        String str1 = "bcadeh";
        String str2 = "hea";

        Set<Character> removeChars = checkAnagram(str1,str2);
        removeChars.forEach(System.out::println);

    }

    public static Set<Character> checkAnagram(String word1,String word2){

        String longWord = word1;
        String shortWord = word2;
        if (word2.length()>word1.length()){
            longWord = word2;
            shortWord = word1;
        }
        Map<Character,Integer> charMap = new HashMap<Character, Integer>();

        for (int i=0;i<longWord.length();i++){
            int count =1;
            if (charMap.get(longWord.charAt(i))!=null){
                count = charMap.get(longWord.charAt(i))+1;
            }
            charMap.put(longWord.charAt(i),count);
        }


        for (int i=0;i<shortWord.length();i++){
            int count = 1;
            if (charMap.get(shortWord.charAt(i))!=null){
                count = charMap.get(shortWord.charAt(i))-1;
            }
            charMap.put(shortWord.charAt(i),count);
        }

        Set<Character> removedCharacters = new HashSet<>();
        for (Map.Entry<Character,Integer> me:charMap.entrySet()){
            if (me.getValue()!=0){
                removedCharacters.add(me.getKey());
            }


        }
        return removedCharacters;
    }
}
