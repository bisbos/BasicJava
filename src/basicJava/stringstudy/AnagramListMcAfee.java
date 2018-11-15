package basicJava.stringstudy;

import java.util.*;

public class AnagramListMcAfee {

    public static void main(String[] args) {
        final String[] input = {"abc", "cat", "cba", "test", "sett", "tar", "rat", "pat", "tap", "pta"};
        Map<CustString,Set<String>> resultMap = new HashMap<>();

        for (int i=0;i<input.length;i++){
            CustString custString = new CustString(input[i]);
            if (resultMap.get(custString)==null){
                Set<String> values = new HashSet<>();
                values.add(custString.str);
                resultMap.put(custString,values);
            }else {
                resultMap.get(custString).add(custString.str);
            }
        }
        System.out.println(resultMap.values());
    }
}

class CustString {

    String str;
    CustString(String str){
        this.str = str;
    }


    @Override
    public int hashCode() {
        int sum=0;
        for(int i=0;i<str.length();i++){
            sum+=str.charAt(i)-'0';
        }
        return sum;
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode()==obj.hashCode();
    }
}
