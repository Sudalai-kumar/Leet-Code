class Solution {
    public long sumAndMultiply(int n) {
        long num=0;
        long sum=0;
        while(n>0){
            int d=n%10;
            if(d!=0)
                num=num*10+d;
            sum+=d;
            n=n/10;
        }
        long temp=0;
        while(num>0){
            long d=num%10;
            temp=temp*10+d;
            num/=10;
        }
        return sum*temp;
    }
}