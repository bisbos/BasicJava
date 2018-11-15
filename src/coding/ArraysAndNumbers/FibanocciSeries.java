package coding.ArraysAndNumbers;

public class FibanocciSeries {

    public static void main(String[] args) {
        fibanocci(8);
    }

    public static void fibanocci(int value){

        if (value==0){
            System.out.println(value);
        }

        int t1=0,t2=1;

        for (int i=0;i<value;i++){
            System.out.print(t1+"\t");
            int sum = t1+t2;
            t1= t2;
            t2 = sum;
        }
    }
}
