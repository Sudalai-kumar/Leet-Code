class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int e=n-1;
        int m=0;
        int s=0;
        while(m<=e){
            if(nums[m]==0){
                int temp=nums[m];
                nums[m]=nums[s];
                nums[s]=temp;
                s++;
                m++;
            }else if(nums[m]==1){
                m++;
            }else{
                int temp=nums[m];
                nums[m]=nums[e];
                nums[e]=temp;
                e--;
            }
        }
    }
}