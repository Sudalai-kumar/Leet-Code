class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p=new PriorityQueue<>(k,(a,b)->b-a);
        for(int i=0;i<nums.length;i++){
            p.add(nums[i]);
        }
        for(int i=0;i<k-1;i++){
            p.poll();
        }
        return p.peek();
    }
}