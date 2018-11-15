package java8.lambda.methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Reference to a static Method
 */
public class MethodReferenceStatic1 {

    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(15,18,12,13,14,6,24,26,25,27,19);
        List primeNumbers  = primeNumbers(numberList,MethodReferenceStatic1::isPrime);
        System.out.println(primeNumbers);
    }

    public static boolean isPrime(int number){
        if (number==1){
            return false;
        }else {
            for (int i=2;i<number;i++){
                if (number%i==0)
                    return false;
            }
        }
        return true;
    }

    public static List primeNumbers(List<Integer> list, Predicate<Integer> predicate){
        List primeNumberList = new ArrayList();
        list.stream().filter(number -> predicate.test(number)).forEach(primeNumberList::add);
        return primeNumberList;
    }

}
