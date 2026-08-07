class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int ans=0;
        int q=n/8;
        int r=n%8;
        for(int i=1;i<=q;i++){
            ans+=8*i;
        }
        if(r!=0)
            ans+=r*(q+1);
        return ans;
    }
}