class Solution {
    public int minimumDistance(int[] nums) {
        int len=nums.length;
        int minDis=Integer.MAX_VALUE;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(nums[i]==nums[j] && i!=j){
                    for(int k=+1;k<len;k++){
                        if(nums[j]==nums[k]&&j!=k&&i!=k){
                            minDis=Math.min(minDis,(Math.abs(i-j)+Math.abs(j-k)+Math.abs(k-i)));
                        }
                    }
                }
            }
        }
        if (minDis==Integer.MAX_VALUE) return -1;
        return minDis;
    }
}