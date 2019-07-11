package coding.leetcode;


import java.util.Arrays;

/**
 * There are N children standing in a line. Each child is assigned a rating value.
 *
 * You are giving candies to these children subjected to the following requirements:
 *
 * Each child must have at least one candy.
 * Children with a higher rating get more candies than their neighbors.
 * What is the minimum candies you must give?
 *
 * https://leetcode.com/problems/candy/
 * https://www.programcreek.com/2014/03/leetcode-candy-java/
 *
 */

public class Candy_135 {

    public static void main(String[] args) {
    //    int[] arr = {1,0,2};

        int[] arr = {1,2,2};

        int[] candies = new int[arr.length];
        candies[0]=1;
        int total =0;

        for (int i=1;i<arr.length;i++){
            if (arr[i]>arr[i-1]){
                candies[i]=candies[i-1]+1;
            }else {
                candies[i]=1;
            }
        }

        for (int i=arr.length-1;i>0;i--){
            if (arr[i-1] > arr[i]) {
                candies[i-1]=candies[i]+1;
            }
        }

        System.out.println(Arrays.toString(candies));
    }
}
