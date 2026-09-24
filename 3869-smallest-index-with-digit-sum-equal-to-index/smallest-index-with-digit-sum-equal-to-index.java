class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length;

        for(int i=0;i<n;i++){
            int dsum=0;
            int num=nums[i];
            while(num>0){
                dsum+=num%10;
                num/=10;
            }
            if(dsum==i) return i;
        }
        return -1;
    }
}