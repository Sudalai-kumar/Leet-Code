class Solution {
    public int[] maxValue(int[] nums) {
        int len=nums.length;
        int pre[]=new int[len];
        int suf[]=new int[len];
        int res[]=new int[len];
        pre[0]=nums[0];
        for(int i=1;i<len;i++){
            pre[i]=Math.max(pre[i-1],nums[i]);
        }
        suf[len-1]=nums[len-1];
        for(int i=len-2;i>0;i--){
            suf[i]=Math.min(suf[i+1],nums[i]);
        }
        res[len-1]=pre[len-1];
        for(int i=len-2;i>=0;i--){
            if(pre[i]>suf[i+1]){
                res[i]=res[i+1];
            }
            else{
                res[i]=pre[i];
            }
        }
        return res;
    }
}