class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int minVal = Integer.MAX_VALUE;
        int maxVal = 0;

        for(int i = 0; i < n; i++){
            if(prices[i] < minVal){
                minVal = prices[i];
            }

            maxVal = Math.max(maxVal, prices[i] - minVal);
        }

        return maxVal;

    }
}
