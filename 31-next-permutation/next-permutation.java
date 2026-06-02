class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int pivot=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1){
            for(int i=0;i<n/2;i++){
                int temp=nums[i];
                nums[i]=nums[n-1-i];
                nums[n-1-i]=temp;
            }
            return;
        }
        int sl=-1;
        for(int i=n-1;i>pivot;i--){
            if(nums[i]>nums[pivot]){
                sl=i;
                break;
            }
        }
    
        int temp=nums[pivot];
        nums[pivot]=nums[sl];
        nums[sl]=temp;
        int left=pivot+1;
        int right=n-1;
        while(left<right){
            int t=nums[left];
            nums[left]=nums[right];
            nums[right]=t;
            left++;
            right--;
        }
        
    }
}