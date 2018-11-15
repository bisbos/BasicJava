package java8.lambda.methodreference;


import java8.lambda.NumberOp;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferenceStatic {

    public static void main(String[] args) {

        NumberOp numberOp = (value -> value + 10);
        int result = numberOperation(numberOp,30);
        System.out.println(result);

        int result1 = numberOperation(NumberOperation::numOperation,30);
        System.out.println(result1);

        Function<Integer,Integer> addResult = AdditionOps::add;
        Integer result2 = addResult.apply(10);
        System.out.println(result2);

        NumberOp addResult1= AdditionOps::add;
        Integer result3 = addResult1.performOp(10);
        System.out.println(result3);

    }

    static int numberOperation(NumberOp numberOp,int number){
        return numberOp.performOp(number);
    }

}

class NumberOperation {
    static int numOperation(int value){
        int result = value +10;
        return result;
    }
}

class AdditionOps {

    public static int add(int a){
        return a+10;
    }
}
