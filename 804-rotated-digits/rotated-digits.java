class Solution {
    private boolean isGood(int x){
        boolean dgood=false;
        while(x>0){
            int digit=x%10;
            if(digit==3||digit==4||digit==7){
                return false;
            }
            else if(digit==0||digit==1||digit==8){
                dgood=dgood;
            }
            else{
                dgood=true;
            }
            x=x/10;
        }
        return dgood;
    }
    public int rotatedDigits(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(isGood(i)){
                count++;
            }
        }
        return count;
    }
}