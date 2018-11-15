package dataStructures.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] numArray = {9,3,5,2,7};
        mergeSort.sort(numArray,0,numArray.length-1);

        System.out.println(Arrays.toString(numArray));

    }

    private void sort(int[] numberArray,int lowerIndex,int higherIndex){
        if (lowerIndex<higherIndex){
            int middle = (lowerIndex+higherIndex)/2;

            //Sort left side
            sort(numberArray,lowerIndex,middle);

            //Sort right side
            sort(numberArray,middle+1,higherIndex);

            merge(numberArray,lowerIndex,middle,higherIndex);
        }
    }

    private void merge(int[] numberArray,int lowerIndex,int middle,int higherIndex){
        int[] tempArray = new int[numberArray.length];

        for (int i=lowerIndex;i<=higherIndex;i++){
            tempArray[i] = numberArray[i];
        }

        int i = lowerIndex;
        int j = middle+1;
        int k = lowerIndex;

        while (i<=middle && j<=higherIndex){
            if (tempArray[i]<=tempArray[j]){
                numberArray[k] = tempArray[i];
                i++;
            }else{
                numberArray[k]=tempArray[j];
                j++;
            }
            k++;
        }
        while (i<=middle){
            numberArray[k]=tempArray[i];
            i++;
            k++;
        }
    }
}
