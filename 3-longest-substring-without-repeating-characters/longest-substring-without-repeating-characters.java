class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=s.length();
        HashSet<Character> set=new HashSet<>();
        int j=0;
        int maxLen=0;
        char crr[]=s.toCharArray();
        for(int i=0;i<l;i++){
            while(set.contains(crr[i])){
                set.remove(crr[j]);
                j++;
            }
            set.add(crr[i]);
            maxLen=Math.max(maxLen,set.size());
        }
        return maxLen;
    }
}