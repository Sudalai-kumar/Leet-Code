class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length;
        int decCount=1;
        int incCount=1;
        int max=1;
 
        for(int i=1;i<n;i++){
           incCount=nums[i-1]<nums[i]?incCount+1:1;
           decCount=nums[i-1]>nums[i]?decCount+1:1;
           max=Math.max(max,Math.max(incCount,decCount));
        }
        return max;
    }
}