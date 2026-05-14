class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n==1)return false;
        if(n<3){
            if(nums[0]==1&nums[1]==1){
                return true;
            }return false;
        }
        if(nums[n-1]!=nums[n-2]){
            return false;
        }
        int con=nums[n-1];
        if(n>con+1) return false;
        for(int i=1;i<=con;i++){
            if(i!=nums[i-1]) return false;
        }
        return true;
    }
}