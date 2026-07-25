class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        int lval=Integer.MIN_VALUE;
        int rval=Integer.MIN_VALUE;
        // if(n==1){
        //     return 0;
        // }
        // if(lval<nums[0] && nums[0]>nums[1]){
        //     return 0;
        // }
        // if(nums[n-2]<nums[n-1] && nums[n-1]>rval){
        //     return n-1;
        // }
        while(l<r){
            int m=l+(r-l)/2;
            if(nums[m]>nums[m+1]){
                r=m;
            }else {
                l=m+1;
            }
        }
        return l;

    }
}