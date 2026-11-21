class Solution {
    public int hammingWeight(int n) {
        
        int count=0;
        for( int i=31;i>=0;i--){
            double b=Math.pow(2,i);
            if(n>=b){
                n-=b;
                count++;
            }
            if(n==0)break;
        }
        return count;
    }
}