package coding.ArraysAndNumbers;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        SwapTwoNumbers numbers = new SwapTwoNumbers();
        Integer x = 10;
        Integer y = 20;

        x= x+y;
        y=x-y;
        x = x-y;


     /*   numbers.swap(x,y); */
        System.out.println(x+" "+y);
    }

    public void swap(int x,int y){
        int temp = x;
        x =y;
        y= temp;
    }
}
