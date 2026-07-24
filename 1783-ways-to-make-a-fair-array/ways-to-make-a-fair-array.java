class Solution {
    public int waysToMakeFair(int[] nums) {
        int n=nums.length;
        int prefix[]=new int[n];
        int totalEven=0;
        int totalOdd=0; 
        for(int i=0;i<n;i++){
            if(i%2==0){
                totalEven+=nums[i];
            }else{
                totalOdd+=nums[i];
            }
        }
        int oddSum=0;
        int evenSum=0;
        int fair=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                int tempOdd=totalEven-(evenSum+nums[i]);
                int tempEven=totalOdd-oddSum;
                if(oddSum+tempOdd==evenSum+tempEven){
                    fair+=1;
                }
                evenSum+=nums[i];
            }else{
                int tempEven=totalOdd-(oddSum+nums[i]);
                int tempOdd=totalEven-evenSum;
                if(oddSum+tempOdd==tempEven+evenSum){
                    fair+=1;
                }
                oddSum+=nums[i];
            }
        }
        return fair;
    }
}