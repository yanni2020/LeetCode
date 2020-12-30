package Array;

public class BestTimeToBuyAndSell {

    //memory less than 82.02%
    public static int solution1(int[] prices) {
        int max=0;
        for(int i=0; i<prices.length-1; i++){
            for(int j=i+1; j<prices.length; j++){
                if(prices[j]-prices[i]>max){
                    max = prices[j]-prices[i];
                }
            }
        }

        return max;
    }


    //faster than 97.47%
    public static int solution2(int[] prices){
        //the known min price in the iterated process.
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }
            else if(maxProfit<prices[i]-minPrice){
                maxProfit = prices[i]-minPrice;
            }
        }
        return maxProfit;

    }

    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(solution2(prices));
    }
}
