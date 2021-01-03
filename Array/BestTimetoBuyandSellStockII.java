package Array;
/**
 * #122. Best Time to Buy and Sell Stock II
 * 
 * Say you have an array prices for which the ith element is the price of a 
 * given stock on day i.Design an algorithm to find the maximum profit. You may 
 * complete as many transactions as you like (i.e., buy one and sell one share 
 * of the stock multiple times).
 */

public class BestTimetoBuyandSellStockII {
    /**
     * solutions of problem.
     */

    public static int solution(int[] prices){
        /**
         * max profit = the sum of every peak-valley.
         * 
         * 
         */
        int min = prices[0];
        int maxProfit=0;
        int i=0;
        while(i<prices.length-1){
                while(i<prices.length-1 && prices[i] >= prices[i+1]){
                    //search next valley.
                    i++;
                }
                min = prices[i];                              
                while(i<prices.length-1 && prices[i] <= prices[i+1]){
                    //search next peak.                  
                    i++;
                }
                //add current profit to maxProfit.
                maxProfit += prices[i] - min;
        }
        return maxProfit;
    }

}
