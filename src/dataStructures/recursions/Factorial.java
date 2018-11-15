package dataStructures.recursions;

public class Factorial {

    public static void main(String[] args) {

        Factorial fact = new Factorial();
        System.out.println(fact.factorial(5));
    }

    public int factorial(int number){
        if (number==0){
            return 1;
        }
        return number*factorial(number-1);
    }
}
