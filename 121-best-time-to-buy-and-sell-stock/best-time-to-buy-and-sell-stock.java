class Solution {
    public int maxProfit(int[] prices) {
        int l=prices.length;
        int res=0;
        int min=10000;
        for(int i=0;i<l;i++){
            min=Math.min(min,prices[i]);
            res=Math.max(res,prices[i]-min);
        }
        return res;
    }
}