class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n=nums.length;
        List<String> res=new ArrayList<>();
        String range;
        int i=0;
        while(i<n){
            int start=nums[i++];
            while(i<n && nums[i]==nums[i-1]+1){
                i++;
            }
            if(start==nums[i-1]){
                range=start+"";
            }else{
                range=start+"->"+nums[i-1];
            }
            res.add(range);
        }
        return res;
    }
}