class Solution {
    private int wavines(int n){
        int prev=-1;
        int cur=-1;
        int sum=0;
        while(n>0){
            int digit=n%10;
            n/=10;
            if(prev!=-1&&cur!=-1){
                if(digit>cur && cur<prev){
                    sum++;
                }else if(digit<cur && cur>prev){
                    sum++;
                }
            }
            prev=cur;
            cur=digit;
        }
        return sum;

    }
    public int totalWaviness(int num1, int num2) {
        int sum=0;
        for(int i=num1;i<=num2;i++){
            sum+=wavines(i);
        }
        return sum;
    }
}