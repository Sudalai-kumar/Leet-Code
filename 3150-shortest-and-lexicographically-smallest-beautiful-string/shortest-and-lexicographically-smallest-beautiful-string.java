class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        String res="";
        for(int i=0;i<n;i++){
            int count=0;
            int len=0;
            for(int j=i;j<n;j++){
                if(s.charAt(j)=='1') count++;
                if(count>k) break;
                if(count==k){
                    String cur=s.substring(i,j+1);
                    if(res.isEmpty()||res.length()>cur.length()||(cur.length()==res.length() && cur.compareTo(res) < 0))
                        res=cur;
                }
                len++;
            }
        }
        return res;
    }
}