class Solution {
    // private String res="";
    // private void LCS_print(char[][] b,String s2,int i,int j){
    //     if (b[i][j]=='d'){
    //         res=s2.charAt(j-1)+res;
    //         LCS_print(b,s2,i-1,j-1);
    //     }
    //     else if(b[i][j]=='u'){
    //         LCS_print(b,s2,i-1,j);
    //     }
    //     else if(b[i][j]=='l'){
    //         LCS_print(b,s2,i,j-1);
    //     }
    // }
    private int LCS_length(String text1, String text2,int m,int n){
        int c[][]=new int [m+1][n+1];
        // char b[][]=new char [m+1][n+1];
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
        // for(int i=0;i<=m;i++){
        //     for(int j=0;j<=n;j++){
        //         System.out.print(" "+c[i][j]+""+b[i][j]);
        //     }
        //     System.out.println();
        // }
        // int LCS_len=c[m][n];
        // for(int j=n;j>=0;j--){
        //     if(c[m][j]==LCS_len){
        //         LCS_print(b,text2,m,j);
        //         System.out.println(res);
        //         res="";
        //     }
        // }
        return c[m][n];
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int len1=text1.length();
        int len2=text2.length();
        int res=LCS_length(text1,text2,len1,len2);
        return res;
    }
}