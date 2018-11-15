package coding.ArraysAndNumbers;

public class FindMaxMultiplicationElements {

    public static void main(String[] args) {

        Integer[] elementArray ={ 2,7,5,10,8,4,12,23,-14,-9,-1};

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i=0;i<elementArray.length-1;i++){
            if (elementArray[i]>max1){
                max3= max2;
                max2 = max1;
                max1 = elementArray[i];
            }else if (elementArray[i]>max2){
                max3 = max2;
                max2 = elementArray[i];
            }else if (elementArray[i]>max3){
                max3 = elementArray[i];
            }

            if (elementArray[i]<min1){
                min2 = min1;
                min1 = elementArray[i];
            }else if (elementArray[i]<min2){
                min2 = elementArray[i];
            }
        }
        int result1 = max1*max2*max3;
        System.out.println(max1+" "+max2+" "+max3);
        System.out.println(result1);
        int result2 = max1*min1*min2;
        System.out.println(max1+" "+min1+" "+min2);
        System.out.println(result2);

        int result = result1>result2?result1:result2;
        System.out.println(result);
    }


}
