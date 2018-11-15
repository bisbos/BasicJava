package java8.lambda;

interface Calculate {
    Integer add (int a,int b);
}

public class FirstLambda {

    public static void main(String[] args) {

        Calculate calculate = ((a,b)->a+b);
        int result = calculate.add(10,15);
        System.out.println(result);

        StringOp stringOp = (a -> a.toLowerCase());
        System.out.println(stringOp.performOperation("BISIN"));

        NumberOp numberOp = (value -> {
            int factorial = 1;
            for (int i=value;i>0;i--){
                factorial= factorial*i;
            }
            return factorial;
        });

        int factorial = numberOp.performOp(5);
        System.out.println(factorial);



    }
}
