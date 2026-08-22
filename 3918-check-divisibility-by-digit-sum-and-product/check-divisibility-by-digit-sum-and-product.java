class Solution {
    public boolean checkDivisibility(int n) {
        int num=n;
        int digitSum=0;
        int digitPrd=1;
        while(n>0){
            int digit=n%10;
            digitSum+=digit;
            digitPrd*=digit;
            n/=10;
        }
        if(num%(digitSum+digitPrd)==0){
            return true;
        }
        return false;
    }
}