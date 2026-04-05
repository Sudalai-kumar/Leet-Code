class Solution {
    public boolean judgeCircle(String moves) {
        int len=moves.length();
        if(len%2!=0) return false;
        char[] arr=moves.toCharArray();
        int v=0;
        int h=0;
        for(int i=0;i<len;i++){
            if(arr[i]=='U'){
                v++;
            }
            else if(arr[i]=='D'){
                v--;
            }
            else if(arr[i]=='L'){
                h--;
            }
            else{
                h++;
            }
        }
        return (v==0&&h==0)?true:false;
    }
}