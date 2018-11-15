package dataStructures.sorting;

import java.util.Arrays;

public class MergeSort1 {

    public static void main(String[] args) {

        MergeSort1 mergeSort1 = new MergeSort1();
        int[] numArray = {9,3,5,2,7};
        mergeSort1.sort(numArray,0,numArray.length-1);
        System.out.println(Arrays.toString(numArray));
    }

    public void sort(int[] numArray,int lowerIndex,int higherIndex){
        if (lowerIndex<higherIndex){
            int middle = (lowerIndex+higherIndex)/2;

            //Sort left Side of the middle
            sort(numArray,lowerIndex,middle);

            //sort right side of the middle
            sort(numArray,middle+1,higherIndex);

            //merge intermediate array
            merge(numArray,lowerIndex,middle,higherIndex);
        }
    }

    public void merge(int[] numArray,int lowerIndex,int middle,int higherIndex){

        //Find Size of two sub arrays to be merged

        int len1 = middle - lowerIndex + 1;
        int len2 = higherIndex - middle;

        //Create Temp Arrays
        int[] leftArray = new int[len1];
        int[] rightArray = new int[len2];

        // Copy data to temp Arrays
        for (int i=0;i<len1;i++){
            leftArray[i]=numArray[lowerIndex+i];
        }

        for (int j=0;j<len2;j++){
            rightArray[j] = numArray[middle+1+j];
        }

        //Merge temp Arrays

        //initial index of first and second subArray
        int i=0,j=0;

        //initial index of merged sub array
        int k=lowerIndex;

        while(i<len1 && j<len2){
            if (leftArray[i]<=rightArray[j]){
                numArray[k]=leftArray[i];
                i++;
            }else{
                numArray[k]=rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements if any not copied
        while(i<len1){
            numArray[k]=leftArray[i];
            k++;
            i++;
        }

        while (j<len2){
            numArray[k]=rightArray[j];
            k++;
            j++;
        }

    }
}
