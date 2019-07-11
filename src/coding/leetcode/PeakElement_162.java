package coding.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A peak element is an element that is greater than its neighbors.
 *
 */
public class PeakElement_162 {

    public static void main(String[] args) {
         int[] nums = {1,2,1,3,5,6,4};
        peakElements(nums);
     //   System.out.println(peakElement(nums));

    }

    private static void peakElements(int[] nums){
        int[] output = new int[nums.length];
        for (int i=1;i<nums.length-1;i++){
            if (nums[i]>nums[i-1]){
                output[i]=1;
            }else {
                output[i-1]=0;
            }
        }

        for (int i=nums.length-1;i>1;i--){
            if (nums[i]<nums[i-1]){
                output[i-1]=1;
            }else {
                output[i-1]=0;
            }
        }
        System.out.println(Arrays.toString(output));

        for (int i=0;i<output.length-1;i++){
            if (output[i]==1){
                System.out.println(nums[i]);
            }
        }
    }

    private static int peakElement(int[] num){
        int low = 0;
        int high = num.length-1;

        while(low < high)
        {
            int mid1 = (low+high)/2;
            int mid2 = mid1+1;
            if(num[mid1] < num[mid2])
                low = mid2;
            else
                high = mid1;
        }
        return low;
    }

}
