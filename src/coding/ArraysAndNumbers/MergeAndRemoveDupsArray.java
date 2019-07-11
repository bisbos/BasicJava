package coding.ArraysAndNumbers;

import java.util.Arrays;


/**
 *
 * Time Complexity : O (nlogn + mlogm + (n + m))
 * Space Complexity : O ( (n + m)
 *
 */
public class MergeAndRemoveDupsArray {

    public static void main(String[] args) {

        int a[] = {9,9,10,10,1};
        int b[] = {81,71,1,4};

        Arrays.sort(a);
        Arrays.sort(b);

        int i=0,j=0;
        int[] result = new int[a.length+b.length];
        int k=0;
        while (i<a.length && j<b.length){
            if (a[i]<b[j]){
               result[k++] = a[i++];
            }else {
                result[k++] = b[j++];
            }
        }

        while (i<a.length){
            result[k++] = a[i++];
        }

        while ((j<b.length)){
            result[k++] = b[j++];
        }

        System.out.println(Arrays.toString(result));
        int[] output = removeDuplicates(result);
        System.out.println(Arrays.toString(output));
    }

    public static int[] removeDuplicates(int[] arr){
        int[] result = new int[arr.length];
        int j=0;
        result[j++]= arr[0];
        int current = arr[0];
        boolean found = false;

        for (int i=1;i<arr.length;i++){
            if (current==arr[i] && !found){
                found = true;
            }else if (current!=arr[i]){
                found = false;
                current = arr[i];
                result[j++] = arr[i];
            }
        }
        return result;
    }
}
