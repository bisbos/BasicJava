package java8.lambda.methodreference;

import java8.lambda.NumberOp;

public class MethodReferenceInstance {

    public static void main(String[] args) {

        NumberOp numberOp = (value -> value + 10);
        int result = numberOperation(numberOp,30);
        System.out.println(result);

        NumberOperation1 num1 = new NumberOperation1();
        int result1 = numberOperation(num1::numOperation,30);
        System.out.println(result1);

    }

    static int numberOperation(NumberOp numberOp,int number){
        return numberOp.performOp(number);
    }

}

class NumberOperation1 {
    int numOperation(int value){
        int result = value +10;
        return result;
    }
}
