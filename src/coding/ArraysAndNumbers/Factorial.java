package coding.ArraysAndNumbers;

public class Factorial {

    public static void main(String[] args) {

        System.out.println(new Factorial().getFactorial(6));
    }

    public int getFactorial(int number){
        int fact =1;
        for (int i=1;i<number;i++){
            fact = fact*i;
        }
        return fact;
    }
}
