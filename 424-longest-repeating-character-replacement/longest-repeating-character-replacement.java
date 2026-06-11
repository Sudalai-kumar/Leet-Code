class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        char crr[]=s.toCharArray();
        int freq[]=new int[26];
        int maxFreq=0;
        int maxLen=0;
        int j=0;
        for(int i=0;i<n;i++){
            freq[crr[i]-'A']++;
            maxFreq=Math.max(maxFreq,freq[crr[i]-'A']);
            while((i-j+1-maxFreq) > k){
                freq[crr[j]-'A']--;
                j++;
            }
            maxLen=Math.max(maxLen,i-j+1);
        }
        return maxLen;
    }
}