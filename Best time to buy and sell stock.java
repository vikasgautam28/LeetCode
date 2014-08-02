public class Solution {
    public int maxProfit(int[] prices) {
        int buy=0;
        int sell=0;
        int maxdiff=0;
        
        for(int i=0;i<prices.length;i++)
        {
            if(prices[buy]>prices[i])
            {
                buy=i;
            }
            if(maxdiff<prices[i]-prices[buy])
            {
                maxdiff=prices[i]-prices[buy];
                sell=i;
            }
        }
        
        return maxdiff;
        
    }
}