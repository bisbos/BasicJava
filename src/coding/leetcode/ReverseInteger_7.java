package coding.leetcode;

public class ReverseInteger_7 {

    public static void main(String[] args) {

        int value = -123;

        int result =0;

        while (value!=0){
            int reminder = value%10;
            value = value/10;
            result = result*10+reminder;
        }

        System.out.println(result);
    }
}
