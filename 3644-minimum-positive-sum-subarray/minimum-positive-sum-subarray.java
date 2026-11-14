class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min=Integer.MAX_VALUE;
        int n=nums.size();
        while(l<=r){
            for(int i=0;i<=n-l;i++){
                int sum=0;
                for(int j=i;j<i+l;j++){
                    sum+=nums.get(j);
                }
                if(sum<=0) sum=0;
                else
                    min=Math.min(sum,min);
            }
            l++;
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}