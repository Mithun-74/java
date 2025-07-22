class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = Integer.MAX_VALUE;
        int value = 0;
        for(int i=0;i<n;i++){
           min = Math.min(prices[i],min);
           value = Math.max((prices[i]-min),value);
        }
        return value;
    }
}
