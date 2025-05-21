class Solution {
    public int maxProfit(int[] arr) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : arr){
            if(price < minPrice){
                minPrice = price;
            }

            int profit = price - minPrice;
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}