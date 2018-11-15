package basicJava.arraysAndNumbers;

public class FibanocciSeries {

    public static void main(String[] args) {

        for (int i=0;i<10;i++) {
            System.out.print(fibanocci(i)+"\t");
        }

        System.out.println();
        fibanocci1(10);

    }

    public static int fibanocci(int n){
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        return fibanocci(n-1)+ fibanocci(n-2);
    }

    public static void fibanocci1(int n){
        if(n==0){
            System.out.print(fibanocci(n)+"\t");
        }
        int a=0,b=1,c=0;
        for (int i=0;i<n;i++){
            System.out.print(a + "\t");
            c = a+b;
            a = b;
            b =c;

        }
    }
}
