class Solution {
    private int GCD(int oddSum,int evenSum){
        int ans=0;
        for(int i=1;i<=Math.sqrt(Math.min(oddSum,evenSum));i++){
            if(oddSum%i==0 && evenSum%i==0){
                ans=i;
            }
        }
        return ans;
    }
    public int gcdOfOddEvenSums(int n) {
        int oddSum=0;
        int evenSum=0;
        for(int i=1;i<=n*2;i+=2){
            oddSum+=i;
            evenSum+=i+1;
        }
        return GCD(oddSum,evenSum);
    }
}