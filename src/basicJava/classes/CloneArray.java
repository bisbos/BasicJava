package basicJava.classes;

public class CloneArray {

    public static void main(String[] args) {

        int[] arrayA = {1,2,3,4,5};
        System.out.println(arrayA[3]);

        int[] arrayB = arrayA.clone();
        System.out.println(arrayB[3]);

        arrayB[3] =8;
        System.out.println(arrayB[3]);
        System.out.println(arrayA[3]);

    }
}
