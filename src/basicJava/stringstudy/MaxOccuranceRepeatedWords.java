package basicJava.stringstudy;

import java.util.*;
import java.util.stream.Collectors;

public class MaxOccuranceRepeatedWords {

    public static void main(String[] args) {

        String value = "Hello my name is Hello name name is hello present name my hello this my name is hello present name hello";
    //    String value = null;

        MaxOccuranceRepeatedWords maxOccurance = new MaxOccuranceRepeatedWords();
        Map<String,Integer> wordCountMap = maxOccurance.getWordCount(value);
        System.out.println(wordCountMap);

        List<String> wordMaxOccur  = maxOccurance.getWordMaxOccurance(wordCountMap);
        wordMaxOccur.stream().forEach(System.out::println);


        maxOccurance.sortByOccurence(wordCountMap);


    }

    public Map<String,Integer> getWordCount(String value){
        String[] strArray = value.split(" ");
        Map<String,Integer> wordCountMap = new HashMap<>();
        for (int i=0;i<strArray.length;i++){
            int count =0;
            if (null!=wordCountMap.get(strArray[i])){
                count = wordCountMap.get(strArray[i]);
                wordCountMap.put(String.valueOf(strArray[i]).toLowerCase(),++count);
            }else {
                wordCountMap.put(String.valueOf(strArray[i]).toLowerCase(),++count);
            }
        }
        return wordCountMap;
    }

    public List<String> getWordMaxOccurance(Map<String,Integer> wordCountMap){
        List<String> wordMaxOccur = new ArrayList<>();
        int maxCount = 0;
        for (Map.Entry<String,Integer> me:wordCountMap.entrySet()){
            if (me.getValue()>maxCount){
                maxCount = me.getValue();
                wordMaxOccur.clear();
                wordMaxOccur.add(me.getKey());
            }else if (me.getValue()==maxCount){
                wordMaxOccur.add(me.getKey());
            }
        }
        return wordMaxOccur;
    }

    public void sortByOccurence(Map<String,Integer> wordCountMap){
        List<MaxOccuranceComparable> sortedList = new ArrayList<>();
        for (Map.Entry<String,Integer> me:wordCountMap.entrySet()){
            MaxOccuranceComparable maxOccurence = new MaxOccuranceComparable();
            maxOccurence.setWord(me.getKey());
            maxOccurence.setOccurence(me.getValue());
            sortedList.add(maxOccurence);
        }
        Collections.sort(sortedList);

        for (MaxOccuranceComparable occuranceComparable:sortedList){
            System.out.println(occuranceComparable.getWord()+" "+occuranceComparable.getOccurence());
        }
    }
}
