class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2) return 0;
        int buy = 0;
        int sell = 1;
        int maxP = 0;
        while (sell < prices.length){
           
            if(prices[sell] > prices[buy]){
                maxP = Math.max(maxP, prices[sell] - prices[buy]);
                //System.out.println("buy="+buy +" sell="+sell);
            }else{
                buy = sell;
            }
            sell++;
        }
        return maxP;
        
    }
}
