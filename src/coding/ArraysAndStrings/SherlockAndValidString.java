package coding.ArraysAndStrings;

import java.util.*;

/**
 * Sherlock considers a string to be valid if all characters of the string appear the same number of times.
 * It is also valid if he can remove just one character at one index in the string,
 * and the remaining characters will occur the same number of times.
 * Given a string , determine if it is valid.
 *
 * For example, if s="abc", it is a valid string because frequencies are {a:1,b:1,c:1}.
 * So is abcc because we can remove one c and have 1 of each character in the remaining string.
 * If s='abccc' however, the string is not valid as we can only remove 1 occurrence of c .
 * That would leave character frequencies of {a:1,b:1,c:2}.
 *
 */
public class SherlockAndValidString {

    public static void main(String[] args) {

        String s ="aabcd";
        System.out.println(getValidString(s));


    }

    private static String getValidString(String s){
        Map<Character,Integer> countMap = new HashMap<>();

        for (int i=0;i<s.length();i++){
            int count = countMap.getOrDefault(s.charAt(i),0);
            countMap.put(s.charAt(i),++count);
        }

        TreeMap<Integer,List<Character>> characterMapList = new TreeMap<>();
        for(Map.Entry<Character,Integer> me : countMap.entrySet()){
            List<Character> characterList = characterMapList.getOrDefault(me.getValue(),new ArrayList<>());
            characterList.add(me.getKey());
            characterMapList.put(me.getValue(),characterList);
        }

        Set<Integer> countSet = characterMapList.keySet();
        if (countSet.size()>2){
            return "NO";
        }else if (countSet.size()==1){
            return "YES";
        }




        Integer firstKey = characterMapList.firstKey();
        Integer lastKey = characterMapList.lastKey();
        if(characterMapList.get(lastKey).size()>=2 && characterMapList.get(firstKey).size()>=2){
            return "NO";
        }
        if (lastKey-firstKey!=1){
            return "NO";
        }

        return "YES";
    }
}
