package basicJava.arraysAndNumbers;

import java.util.List;
import java.util.Map;

/**
 * https://www.geeksforgeeks.org/maximum-difference-between-two-elements/
 * https://www.geeksforgeeks.org/stock-buy-sell/
 */
public class MaxDifference {

    public static void main(String[] args) {

        MaxDifference diff = new MaxDifference();
        Integer[] numArray = {3,2,10,12,1,4,14};
        diff.getMaxDiff(numArray);
        diff.getMaxDiff1(numArray);

    }

    public void getMaxDiff(Integer[] numberArray){
        int maxDiff = Integer.MIN_VALUE;
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MIN_VALUE;

        for (int i=0;i<numberArray.length;i++){
            for (int j=i+1;j<numberArray.length;j++){
                int diff  = numberArray[j] - numberArray[i];
                if(diff>maxDiff){
                    maxDiff = diff;
                    maxVal = numberArray[j];
                    minVal = numberArray[i];
                }
            }
        }

        System.out.println("Max Difference :"+maxDiff+" \t Max Val :"+maxVal+ " \t Min Val :"+minVal);

    }

    public void getMaxDiff1(Integer[] numberArray){
        int maxDiff = numberArray[1] - numberArray[0];
        int minVal = numberArray[0];
        int maxVal = Integer.MAX_VALUE;
        for (int i=1;i<numberArray.length;i++){
            int diff = numberArray[i] - minVal;
            if (diff>maxDiff){
                maxVal = numberArray[i];
                maxDiff = diff;
            }
            if (numberArray[i]<minVal){
                minVal = numberArray[i];
            }
        }

        System.out.println("Max Difference :"+maxDiff+" \t Max Val :"+maxVal+ " \t Min Val :"+minVal);
    }
}
