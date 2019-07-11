package basicJava;

public class SumConsecutiveNumbers {

    public static void main(String[] args) {
        int n = 15;
        int i = 1, j = 1, count = 0, sum = 1;
        while (j<n) {
            if (sum == n) { // matched, move sub-array section forward by 1
                count++;
                sum -= i;
                i++;
                j++;
                sum +=j;
            } else if (sum < n) { // not matched yet, extend sub-array at end
                j++;
                sum += j;
            } else { // exceeded, reduce sub-array at start
                sum -= i;
                i++;
            }
        }

        System.out.println(count);
    }
}
