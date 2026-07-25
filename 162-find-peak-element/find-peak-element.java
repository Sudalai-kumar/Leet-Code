class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int l=-1;
        int r=n;
        int lval=Integer.MIN_VALUE;
        int rval=Integer.MIN_VALUE;
        if(n==1){
            return 0;
        }
        if(lval<nums[0] && nums[0]>nums[1]){
            return 0;
        }
        if(nums[n-2]<nums[n-1] && nums[n-1]>rval){
            return n-1;
        }
        for(int i=1;i<=n-2;i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                return i;
            }
        }
        return -1;

    }
}