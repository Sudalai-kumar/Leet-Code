class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[Math.abs(nums[i])]<0){
                return nums[Math.abs(nums[i])]*-1;
            }
            nums[Math.abs(nums[i])]*=-1;
        }
        return -1;
    }
}