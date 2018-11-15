package coding.dynamicprogramming;

/**
 * [2,4,6,10]
 * Total = 16
 * {6,10},{2,4,10}
 */
public class SubSetAddtoNumber {

    public static void main(String[] args) {

        System.out.println("Hello World!");
    }

    public int count_sets(int[] arr,int total){
        return rec(arr,total,arr.length-1);
    }

    public int rec(int[] arr,int total,int index){
            if (total==0)
                return 1;
            else if (total<0)
                return 0;
            else if (index<0)
                return 0;
            else if (total<arr[index])
                return rec(arr,total,index-1);
            else
                return rec(arr,total-arr[index],index-1)+rec(arr,total,index-1);
    }
}
