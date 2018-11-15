package coding.dynamicprogramming;

/**
 * Problem Statement: On a positive integer, you can perform any one of the following 3 steps.
 * 1.) Subtract 1 from it. ( n = n - 1 )  ,
 * 2.) If its divisible by 2, divide by 2. ( if n % 2 == 0 , then n = n / 2  )  ,
 * 3.) If its divisible by 3, divide by 3. ( if n % 3 == 0 , then n = n / 3  ).
 * Now the question is, given a positive integer n, find the minimum number of steps that takes n to 1
 *
 * 18 = 18/3 6/3 2-1
 * 10 = 10-1 9/3 3/3
 */
public class MinimumStepsTo1 {

    public static void main(String[] args) {

    //   int min = getMin(4,18,12);
       System.out.println(minSteps(18));
    }


    public static int minSteps(int value){
        int x = value,y = value,z =value;
        if (value<=1)
            return 0;
        if (value%2==0){
            x = minSteps(value/2);
        }
        if (value%3==0){
            y= minSteps(value/3);
        }
        z = minSteps(value-1);
        return 1+getMin(x,y,z);
    }
    public static int getMin(int a,int b,int c){
        return (a<b)?(a<c)?a:c:(b<c)?b:c;
    }
}


