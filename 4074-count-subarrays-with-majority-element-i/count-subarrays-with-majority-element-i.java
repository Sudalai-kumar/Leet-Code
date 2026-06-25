class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int l=nums.length;
        int count=0;
        for(int i=0;i<l;i++){
            long sum=0;
            for(int j=i;j<l;j++){
                if(nums[j]==target) sum++;
                int len=j-i+1;
                if(sum>len/2) count++;
            }
        }
        return count;
    }
}