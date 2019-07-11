package basicJava.stringstudy;


import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings, a and b, that may or may not be of the same length,
 * determine the minimum number of character deletions required to make a and b anagrams.
 * Any characters can be deleted from either of the strings.
 *
 * For example, if a=cde and b=dcf , we can delete e from string a and f from string b so that both
 * remaining strings are and  which are anagrams.
 */
public class AnagramRemoveElements1 {

    public static void main(String[] args) {
        String a ="fcrxzwscanmligyxyvym";
        String b ="jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        System.out.println(makeAnagram(a,b));
    }

    private static int makeAnagram(String s1,String s2){

        Map<Character,Integer> countMap = new HashMap<>();
        for (int i=0;i<s1.length();i++){
            int count = countMap.getOrDefault(s1.charAt(i),0);
            countMap.put(s1.charAt(i),++count);
        }

        for (int i=0;i<s2.length();i++){
            int count = countMap.getOrDefault(s2.charAt(i),0);
            countMap.put(s2.charAt(i),--count);
        }

        System.out.println(countMap);

        int charNum=0;
        for (Integer value:countMap.values()){
            if (value!=0){
                charNum += Math.abs(value);
            }
        }
        return charNum;
    }
}
