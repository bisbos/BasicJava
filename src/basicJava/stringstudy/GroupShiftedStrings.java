package basicJava.stringstudy;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * Given a string, we can "shift" each of its letter to its successive letter,
 * for example: "abc" -> "bcd". We can keep "shifting" which forms the sequence: "abc" -> "bcd" -> ... -> "xyz".
 *
 * Given a list of strings which contains only lowercase alphabets, group all strings that belong to the same shifting sequence, return:
 *
 * [
 *   ["abc","bcd","xyz"],
 *   ["az","ba"],
 *   ["acef"],
 *   ["a","z"]
 * ]
 *
 *
 */
public class GroupShiftedStrings {

    public static void main(String[] args) {


        String[] values = { "abc","az","acef","a","bcd","ba","z","xyz"};
    //    String[] values = { "az","ba"};
        List<List<String>>  outPut = getGroupStrings(values);
        System.out.print(outPut.toString());
    }

    public static List<List<String>> getGroupStrings(String[] values){
        List<List<String>> resultList = new ArrayList<>();
        Map<String,List<String>> valuesMap = new HashMap<>();
        for (String value:values){
            char[] array = value.toCharArray();
            if (array.length>0){
                int diff = array[0]-'a';
                for (int i=0;i<array.length;i++){
                    if (array[i]-diff<'a'){
                        array[i]= (char) (array[i]-diff+26);
                    }else {
                        array[i] = (char)(array[i]-diff);
                    }
                }
            }

            String ns = new String(array);
            if (valuesMap.get(ns)==null){
                List<String> outputValues = new ArrayList<>();
                outputValues.add(value);
                valuesMap.put(ns,outputValues);
            }else{
                valuesMap.get(ns).add(value);
            }
        }
        resultList.addAll(valuesMap.values());
        return resultList;
    }
}
