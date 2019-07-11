package coding.leetcode;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesinArray_442 {

    public static void main(String[] args) {

        int[] nums ={4,3,2,15,8,2,3,1};
        System.out.println(findDuplicates(nums));
        System.out.println(findDuplicates1(nums));

    }

    public static List<Integer> findDuplicates(int[] num){
        Set<Integer> output = new HashSet<>();
        List<Integer> dupList = new ArrayList<>();
        for (int i=0;i<num.length;i++){
            if (!output.add(num[i])){
                dupList.add(num[i]);
            }
        }
       return dupList;
    }

    public static List<Integer> findDuplicates1(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i])-1;
            if (nums[index] < 0)
                res.add(Math.abs(index+1));
            nums[index] = -nums[index];
        }
        return res;
    }
}
