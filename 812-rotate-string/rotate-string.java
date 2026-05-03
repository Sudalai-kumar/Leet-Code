class Solution {
    private int[] buildLsp(char []pattern,int m){
        int k=0;
        int kmp[]=new int[m];
        kmp[0]=0;
        for(int i=1;i<m;i++){
            while(k>0 && pattern[k]!=pattern[i]){
                k=kmp[k-1];
            }
            if(pattern[k]==pattern[i]){
                k++;
            }
            kmp[i]=k;
        }
        return kmp;
    }
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())return false;
        s=s+s;
        char []text=s.toCharArray();
        int n=text.length;
        char []pattern=goal.toCharArray();
        int m=pattern.length;
        
        int[] lsp=buildLsp(pattern,m);
        int q=0;
        for(int i=0;i<n;i++){
            while(q>0 && pattern[q]!=text[i]){
                q=lsp[q-1];
            }
            if(pattern[q]==text[i]){
                q++;
            }if(q==m){
                return true;
            }
        }
        return false;
    }
}