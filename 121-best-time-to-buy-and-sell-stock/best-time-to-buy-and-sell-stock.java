class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max[]=new int[n];
        max[n-1]=prices[n-1];
        for(int i=n-2;i>=0;i--){
            max[i]=Math.max(prices[i],max[i+1]);
        }
        int profit=0;
        for(int i=0;i<n;i++){
            // System.out.println(prices[i]+" - "+max[i]);
            profit=Math.max(profit,Math.abs(prices[i]-max[i]));
        }
        return profit;
    }
}