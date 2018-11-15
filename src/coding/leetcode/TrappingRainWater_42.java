package coding.leetcode;

/**
 * https://leetcode.com/problems/trapping-rain-water/
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it is able to trap after raining.
 *
 * Example:
 *
 * Input: [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 *
 */
public class TrappingRainWater_42 {

    public static void main(String[] args) {

        int[] inputArr = {0,1,0,2,1,0,1,3,2,1,2,1};
    //    int[] inputArr = {7,1,4,0,2,8,6,3,5}; //Result = 23
        int left = 0;
        int right = inputArr.length-1;

        int leftMax =0;
        int rightMax =0;

        int sum =0;

        while (left<right){
            if (inputArr[left]>inputArr[right]){
                if (inputArr[right]>=rightMax){
                    rightMax = inputArr[right];
                }else{
                    sum +=rightMax - inputArr[right];
                }
                right--;
            }else{
               if (inputArr[left]>=leftMax){
                   leftMax=inputArr[left];
               }else {
                   sum += leftMax - inputArr[left];
               }
               left++;
            }
        }

        System.out.println(sum);

    }
}
