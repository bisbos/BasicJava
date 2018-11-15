package dataStructures.recursions;

public class PrintNumberRecursions {

    public static void main(String[] args) {

        PrintNumberRecursions recursions = new PrintNumberRecursions();
        recursions.printNumbers(10);
    }

    public void printNumbers(int number){
        if (number==0){
            return;
        }
        System.out.println(number);
        printNumbers(number-1);
        System.out.println("Hello :"+number);
    }

}
