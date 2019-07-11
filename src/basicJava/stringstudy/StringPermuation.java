package basicJava.stringstudy;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StringPermuation {

    public static void main(String[] args) {

        String value ="abc";
        getPermutation("",value);
    }

    public static void getPermutation(String prefix,String value){
        if (value.length()==0){
            System.out.println(prefix);
        }
        for (int i=0;i<value.length();i++){
           getPermutation(prefix+value.charAt(i),value.substring(0,i)+value.substring(i+1));
        }
    }
}
