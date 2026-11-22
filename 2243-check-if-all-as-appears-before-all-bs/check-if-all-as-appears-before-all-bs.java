class Solution {
    public boolean checkString(String s) {
        boolean ans=false;
        for(char ch:s.toCharArray()){
            if(ch=='b') ans=true;
            if(ans && ch=='a') return false;
        }
        return true;
    }
}