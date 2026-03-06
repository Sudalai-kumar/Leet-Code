class Solution {
    private int LCS_length(String text1, String text2,int m,int n){
        int c[][]=new int [m+1][n+1];
        // char b[][]=new char [m][n];
        for(int i=0;i<=m;i++){
            c[i][0]=0;
        }
        for(int j=0;j<=n;j++){
            c[0][j]=0;
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    c[i][j]=c[i-1][j-1]+1;
                    // b[i][j]='d';
                }
                else if(c[i-1][j]>=c[i][j-1]){
                    c[i][j]=c[i-1][j];
                    // b[i][j]='u';
                }
                else{
                    c[i][j]=c[i][j-1];
                    // b[i][j]='l';
                }
            }
        }
        return c[m][n];
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int len1=text1.length();
        int len2=text2.length();
        int res=LCS_length(text1,text2,len1,len2);
        return res;
    }
}