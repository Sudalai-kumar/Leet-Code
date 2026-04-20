class Solution {
    public int maxDistance(int[] colors) {
        int len=colors.length;
        int left=len-1,right=0;
        for(int i=0;i<len;i++){
            if(colors[i]!=colors[len-1]){
                left=i;
                break;
            }
        }
        for(int j=len-1;j>0;j--){
            if(colors[j]!=colors[0]){
                right=j;
                break;
            }
        }
        return Math.max(len-1-left,right);
    }
}