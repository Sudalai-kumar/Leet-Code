class Solution {
    public int reverseDegree(String s) {
        int res=0;
        int i=1;
        for(char ch:s.toCharArray()){
            int rev=123-ch;
            res+=i++*rev;
            
        }
        return res;
    }
}