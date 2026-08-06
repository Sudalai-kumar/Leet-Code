class Solution {
    public int productOfDigit(int n){
        int prod=1;
        while(n>0){
            prod*=n%10;
            n/=10;
        }
        return prod;
    }
    public int smallestNumber(int n, int t) {
        int  res=n;
        while(true){
            if(productOfDigit(res)%t==0){
                return res;
            }
            res++;
        }
    }
}