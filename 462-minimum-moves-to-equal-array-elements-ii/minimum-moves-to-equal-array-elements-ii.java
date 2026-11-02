class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int m=n/2,moves=0;
        for(int i=0;i<m;i++){
            moves+=nums[m]-nums[i];
        }
        for(int i=m;i<n;i++){
            moves+=nums[i]-nums[m];
        }
        return moves;
    }
}