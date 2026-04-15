class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int len=words.length;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<len;i++) {
            if(words[i].equals(target)) {
                int forward=(i-startIndex+len)%len;
                int backward=(startIndex-i+len)%len;
                ans=Math.min(ans,Math.min(forward,backward));
            }
        }
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}