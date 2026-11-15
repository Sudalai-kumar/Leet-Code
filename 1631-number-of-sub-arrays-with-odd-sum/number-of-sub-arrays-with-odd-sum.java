class Solution {
    public int numOfSubarrays(int[] arr) {
        int n=arr.length;
        int odd=0;
        int even=0;
        int res=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum%2!=0){
                res=(res+1+even)%1000000007;
                odd++;
            }else{
                res=(res+odd)%1000000007;
                even++;
            }
        }
        return res;
    }
}