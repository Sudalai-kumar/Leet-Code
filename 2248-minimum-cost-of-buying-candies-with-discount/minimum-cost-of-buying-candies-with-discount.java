class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n=cost.length;
        if(n<=2){
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=cost[i];
            }
            return sum;
        }
        int mincost=0;
        int i=0;
        for(i=n-2;i>=0;i-=3){
            for(int j=i;j<i+2;j++){
                mincost+=cost[j];
            }
        }
        if(i==-1){
            mincost+=cost[0];
        }
        return mincost;
    }
}