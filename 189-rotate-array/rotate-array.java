class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int r=k%n;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            res[i]=nums[(i+n-r)%n];
        }
        for(int i=0;i<n;i++)
            nums[i]=res[i];
    }
}