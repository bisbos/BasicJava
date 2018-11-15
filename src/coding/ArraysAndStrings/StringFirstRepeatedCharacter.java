package coding.ArraysAndStrings;

import java.util.HashSet;
import java.util.Set;

public class StringFirstRepeatedCharacter {

    public static void main(String[] args) {
        StringFirstRepeatedCharacter repeatedCharacter = new StringFirstRepeatedCharacter();
        System.out.println(repeatedCharacter.firstRepeatedCharacter("Bisin"));
        System.out.println(repeatedCharacter.firstRepeatedCharacter1("Bisin"));
        System.out.println(repeatedCharacter.firstNonRepeatedCharacter("Bisin"));
    }

    public char firstRepeatedCharacter(String value){
        Set<Character> elements = new HashSet<>();
        char repeatedChar =' ';
        for (int i=0;i<value.length();i++){
            if (!elements.add(value.charAt(i))){
                repeatedChar = value.charAt(i);
                break;
            }
        }
        return repeatedChar;
    }

    public char firstRepeatedCharacter1(String value){
        Set<Character> elements = new HashSet<>();
        char repeatedChar =' ';
        for (int i=0;i<value.length();i++){
            String subValue = value.substring(i+1);
            int index = subValue.indexOf(value.charAt(i));
            if (index!=-1){
                repeatedChar = value.charAt(i);
                break;
            }
        }
        return repeatedChar;
    }

    public char firstNonRepeatedCharacter(String value){
        Set<Character> elements = new HashSet<>();
        char nonRepeatedChar = ' ';
        for (int i=0;i<value.length();i++){
            String subValue = value.substring(i+1);
            int index = subValue.indexOf(value.charAt(i));
            if (index==-1){
                nonRepeatedChar = value.charAt(i);
                break;
            }
        }
        return nonRepeatedChar;

    }
}
