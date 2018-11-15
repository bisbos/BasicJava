package java8.lambda;

public class LambdaAsArgument {

    public static void main(String[] args) {

       int result = performCalculation(a->a=10,50);
       System.out.println(result);

       int num =10;
       NumberOp numberOp = (a->{
           int add = num + a;
        //   num++; variable capture - local variables are effectively final
           return add;
       });
       result = numberOp.performOp(25);
       System.out.println(result);
    }

    public static int performCalculation(NumberOp numberOp,int a){
        return numberOp.performOp(a);
    }
}
