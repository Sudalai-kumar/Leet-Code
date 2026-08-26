class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int prefixsum[]=new int[n];
        int suffixsum[]=new int[n];
        int pivot=-1;
        prefixsum[0]=nums[0];
        for(int i=1;i<n;i++){
            prefixsum[i]=nums[i]+prefixsum[i-1];
        }
        suffixsum[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffixsum[i]=nums[i]+suffixsum[i+1];
        }

        for(int i=0;i<n;i++){
            if(prefixsum[i]==suffixsum[i]){
                pivot=i;
                return pivot;
            }
        }
        return pivot;
    }
}