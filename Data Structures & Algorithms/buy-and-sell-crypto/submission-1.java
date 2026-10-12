class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1) return 0;
        int buy = 0;
        int sell = buy+1;
        int profit=0;
        while(true){
            if(sell==prices.length) break;
            if(prices[buy]>prices[sell]){
                buy = sell;
            }else{
                int total = prices[sell]-prices[buy];
                if(profit<total) profit=total;
            }
            sell++;


        }
        return profit;
    }
}
