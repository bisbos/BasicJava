package coding.leetcode;

/**
 * If you were only permitted to complete at most one transaction
 * (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 */
public class BestTimeToBuyAndSellStock_121 {

    public static void main(String[] args) {

        int[] stock= {7,2,9,1,6,4,10};
        int minVal = stock[0];
        int profit = 0;
        for (int i=1;i<stock.length;i++){
            if (profit<stock[i]-minVal) {
                    profit = stock[i] - minVal;
            }
            if (stock[i]<minVal){
                minVal = stock[i];
            }
        }
        System.out.println(profit);
    }
}
