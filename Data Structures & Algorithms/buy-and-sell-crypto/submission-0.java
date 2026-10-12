class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
     for(int i=0;i<prices.length;i++){
        int total=0;
        for(int j=i+1;j<prices.length;j++){
            total = prices[j]-prices[i];
            if(profit<total) profit=total;
        }
     }   
     return profit;
    }
}
