package coding.ArraysAndNumbers;

import java.util.*;

/**
 * Find Elements in an array which sum to 12
 */
public class FindSumPairs {

    public static void main(String[] args) {

        Integer[] elementArray ={ 2,7,5,10,8,4,12};
        int result = 12;
        findSumPairs1(elementArray,result);

    }


    public static void findSumPairs1(Integer[] elementArray,int result){
        Arrays.sort(elementArray);
        int start = 0;
        int end = elementArray.length-1;
        Map<Integer,Integer> sumElements = new HashMap<>();
        while (start<end){
            if (elementArray[start]+elementArray[end]==result){
                sumElements.put(elementArray[start],elementArray[end]);
                start++;
                end--;
            }
            else if (elementArray[start]+elementArray[end]>result){
                end--;
            }else {
                start++;
            }
        }
        System.out.println(sumElements);
    }
}
