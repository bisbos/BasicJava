package coding.leetcode;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

 */
public class TwoSum_1 {

    public static void main(String[] args) {

        int[] numArray = {2,5,11,7};
        int result = 9;

        Arrays.sort(numArray);
        int start = 0;
        int end = numArray.length-1;

        Map<Integer,Integer> resultMap = new HashMap<>();

        while (start<end){
            if (numArray[start]+numArray[end]==result){
                resultMap.put(numArray[start],numArray[end]);
                end--;
                start++;
            }else if (numArray[start]+numArray[end]>result){
                end--;
            }else {
                start++;
            }
        }

        System.out.println(resultMap);
    }
}
