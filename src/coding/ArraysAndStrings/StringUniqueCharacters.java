package coding.ArraysAndStrings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringUniqueCharacters {

    public static void main(String[] args){

        StringUniqueCharacters uniqueCharacters = new StringUniqueCharacters();
        boolean isUnique = uniqueCharacters.isUnique("Bisin");
        if (isUnique){
            System.out.println("Unique");
        }else {
            System.out.println("Not Unique");
        }

        isUnique = uniqueCharacters.isUnique("abcde");
        if (isUnique){
            System.out.println("Unique");
        }else {
            System.out.println("Not Unique");
        }

        isUnique = uniqueCharacters.isUniqueUsingHashSet("Bisin");
        if (isUnique){
            System.out.println("Unique");
        }else {
            System.out.println("Not Unique");
        }

        isUnique = uniqueCharacters.isUniqueUsingHashSet("abcde");
        if (isUnique){
            System.out.println("Unique");
        }else {
            System.out.println("Not Unique");
        }
    }

    public boolean isUniqueUsingHashSet(String value){
        Set<String> elements = new HashSet<>();
        boolean isUnique = true;
        for (int i=0;i<value.length();i++){
            if (!elements.add(String.valueOf(value.charAt(i)))){
                isUnique = false;
                break;
            }
        }
        return isUnique;
    }

    public boolean isUnique(String value){
        boolean[] charArray = new boolean[256];
        boolean isUnique = true;
        for (int i=0;i<value.length();i++){
            int charValue = (int) value.charAt(i);
            if (charArray[charValue]==true){
                isUnique = false;
            }else {
                charArray[charValue] = true;
            }
        }
        return isUnique;
    }
}
