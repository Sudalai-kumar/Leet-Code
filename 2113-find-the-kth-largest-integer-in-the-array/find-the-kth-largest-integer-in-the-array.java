class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        int n=nums.length;
        PriorityQueue<String> maxHeap=new PriorityQueue<>(
            (a,b)->{
                if(a.length()!=b.length()){
                    return a.length()-b.length();
                }
                return a.compareTo(b);
            }
        );
        for(int i=0;i<n;i++){
            maxHeap.add(nums[i]);
            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        } 
        String res=maxHeap.peek();
        return res;
    }
}