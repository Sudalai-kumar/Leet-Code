class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int minIdx=0;
        int maxIdx=0;
        for(int i=0;i<n;i++){
            if(nums[minIdx]>nums[i]){
                minIdx=i;
            }
            if(nums[maxIdx]<nums[i]){
                maxIdx=i;
            }
        }
        int left = Math.min(minIdx, maxIdx);
        int right = Math.max(minIdx, maxIdx);
        int option1 = right + 1;
        int option2 = n - left;
        int option3 = (left + 1) + (n - right);
        return Math.min(option1, Math.min(option2, option3));
    }
}