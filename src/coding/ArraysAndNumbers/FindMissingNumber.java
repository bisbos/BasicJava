package coding.ArraysAndNumbers;

public class FindMissingNumber {

    public static void main(String[] args) {

        int[] elementArray = {1,2,3,4,6,7,8,9,10};
        int totalElements =0;
        for (int i=0;i<elementArray.length-1;i++){
            totalElements += elementArray[i];
        }
        int n = elementArray.length;
        int realSum = n*(n+1)/2;

        int missingElement = realSum - totalElements;
        System.out.println(missingElement);
    }
}
