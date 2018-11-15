package coding.dynamicprogramming;

public class FibanocciSeries {

    public static void main(String[] args) {
    //    System.out.print(fibanocci(5)+"\t");
       for (int i=1;i<10;i++) {
            System.out.print(fibanocci(i)+"\t");
        }
    }

    public static int fibanocci(int n){
        int[] fibArray = new int[n+1];
         fibArray[0]=0;
         if (n==0)
             return fibArray[0];
         fibArray[1]=1;
        for (int i=2;i<fibArray.length-1;i++){
            fibArray[i]= fibArray[i-1]+fibArray[i-2];
        }
        return fibArray[n-1];
    }
}
