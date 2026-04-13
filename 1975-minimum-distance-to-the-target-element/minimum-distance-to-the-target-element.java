class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int l=nums.length;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<l;i++){
            if(nums[i]==target){
                res=Math.min(res, Math.abs(i-start));
            }
        }
        return res;
    }
}