class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> count=new HashMap<>();
        for(int i=0;i<n;i++){
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
            if(count.get(nums[i])>1){
                return true;
            }
        }
        return false;
    }
}