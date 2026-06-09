class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long min=Integer.MAX_VALUE;
        long max=Integer.MIN_VALUE;
        int l=nums.length;
        for(int i=0;i<l;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        return k*(max-min);
    }
}