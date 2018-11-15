package coding.test;

public class RecursionEx {

    public static void main(String[] args) {

       RecursionEx ex = new RecursionEx();
       System.out.println(ex.sumNumbers(6));
    }

    public int sumNumbers(int n){
       System.out.println("Method :"+n);
       if (n==1)
           return 1;
       int result = n + sumNumbers(n-1);
       System.out.print("Returned : "+result);
       System.out.println(" : "+ n +" + PN ("+ n + "-1)");
       return result;
    }
}
