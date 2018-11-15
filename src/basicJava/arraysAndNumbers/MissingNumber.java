package basicJava.arraysAndNumbers;

public class MissingNumber {

    public static void main(String[] args) {

        int[] elements = {1, 2, 4,6, 3, 7, 8,10,9};
        int n = elements.length+1;
        int originalTotal = n*(n+1)/2;
        int sum =0;
        for (int i=0;i<elements.length;i++){
            sum +=elements[i];
        }
        int missingElement = originalTotal-sum;
        System.out.println("Missing Element :"+missingElement);
    }
}
