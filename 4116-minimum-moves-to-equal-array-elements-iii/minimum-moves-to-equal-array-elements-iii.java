class Solution {
    public int minMoves(int[] nums) {
        int max=nums[0];
        int n=nums.length;
        int moves=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
        }
        for(int i=0;i<n;i++){
            moves+=max-nums[i];
        }
        return moves;
    }
}