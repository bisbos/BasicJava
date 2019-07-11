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

    //    int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] arr = {7,1,4,0,2,8,6,3,5}; //Result = 23
        int rightMax=0,leftMax=0,total=0;
        int left=0,right =arr.length-1;

        while (left<right){
            if (arr[left]<arr[right]){
                if (arr[left]>leftMax){
                    leftMax=arr[left];
                }else {
                    total += leftMax-arr[left];
                }
                left++;

            }else {
                if (arr[right]>rightMax){
                    rightMax = arr[right];
                }else {
                    total += rightMax-arr[right];
                }
                right--;
            }
        }

        System.out.println(total);
    }
}
