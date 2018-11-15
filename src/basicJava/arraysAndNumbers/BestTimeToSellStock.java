package basicJava.arraysAndNumbers;


/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 *
 * If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock),
 * design an algorithm to find the maximum profit.
 */

public class BestTimeToSellStock {

    public static void main(String[] args) {

        Integer[] stocks = {2,5,9,1,4,10};
        System.out.println(maxProfit(stocks));
    }

    public static int maxProfit(Integer[] stocks){
        int minValue = stocks[0];
        int profit = 0;
        for (int i=1;i<stocks.length;i++){
            if (stocks[i]<minValue){
                minValue = stocks[i];
            }
            int diff = stocks[i] - minValue;
            if (diff>profit){
                profit = diff;
            }
        }
        return profit;
    }
}
