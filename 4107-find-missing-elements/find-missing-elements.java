class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int track[]=new int[101];
        int n=nums.length;
        int min=nums[0];
        int max=nums[0];
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            track[nums[i]]=1;
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        for(int i=min;i<=max;i++){
            if(track[i]==0){
                res.add(i);
            }
        }
        return res;
    }
}