class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[Math.abs(nums[i])-1]<0){
                res.add(Math.abs(nums[i]));
            }
            nums[Math.abs(nums[i])-1]*=-1;
        }
        return res;
    }
} 