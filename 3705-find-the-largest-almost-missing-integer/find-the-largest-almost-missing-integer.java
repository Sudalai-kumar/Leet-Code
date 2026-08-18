class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> count=new HashMap<>();
        for(int i=0;i<=n-k;i++){
            HashMap<Integer,Integer> subc=new HashMap<>(); 
            for(int j=i;j<i+k;j++){
                if(!subc.containsKey(nums[j])){
                    count.put(nums[j],count.getOrDefault(nums[j],0)+1);
                }
                subc.put(nums[j],subc.getOrDefault(nums[j],0)+1);
            }
        }
        int res=-1;
        for(Map.Entry<Integer,Integer> ele:count.entrySet()){
            if(ele.getValue()==1){
                res=Math.max(ele.getKey(),res);
            }
        }
        return res;
    }
}