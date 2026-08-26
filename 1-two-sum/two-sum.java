class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        Map<Integer, Integer> pairIdx = new HashMap<>();
        int res[]=new int[2];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (pairIdx.containsKey(target - num)) {
                res[0]=i;
                res[1]=pairIdx.get(target-num);
            }
            pairIdx.put(num, i);
        }
        return res;
    }
}