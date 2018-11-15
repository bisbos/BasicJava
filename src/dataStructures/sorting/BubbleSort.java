package dataStructures.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        BubbleSort sort = new BubbleSort();
        int[] numArray = {9,3,5,2,7};
        sort.doBubbleSort(numArray);
        System.out.println(Arrays.toString(numArray));
    }

    public void doBubbleSort(int[] numArray){
        for (int i=0;i<numArray.length-1;i++){
            for (int j=i+1;j<numArray.length-1;j++){
                if (numArray[i]>numArray[j]){
                    int temp = numArray[j];
                    numArray[j]=numArray[i];
                    numArray[i] = temp;
                }
            }
        }
    }
}
