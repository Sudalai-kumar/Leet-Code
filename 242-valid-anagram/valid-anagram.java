class Solution {
    public boolean isAnagram(String s, String t) {
        int c[]=new int[26];
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            c[s.charAt(i)-97]+=1;
            c[t.charAt(i)-97]-=1;
        }
        for(int i=0;i<26;i++){
            if(c[i]!=0) return false;
        }
        return true;
    }
}