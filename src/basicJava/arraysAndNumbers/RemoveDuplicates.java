package basicJava.arraysAndNumbers;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {4, 3, 4, 2, 6, 1, 1, 7, 6, 8, 9, 9, 1, 1};
        Arrays.sort(arr);
        RemoveDuplicates dups = new RemoveDuplicates();
        dups.removeDuplicates(arr);
    }

    public void removeDuplicates(int[] arr){
        int len = arr.length;
        int currentElement = arr[0];
        int[] uniqueArray = new int[arr.length];
        int k=0;
        for(int i=1;i<len;i++){
            if (currentElement!=arr[i]){
                uniqueArray[k++] = currentElement;
                currentElement = arr[i];
            }
        }

        System.out.print(Arrays.toString(uniqueArray));
    }
}
