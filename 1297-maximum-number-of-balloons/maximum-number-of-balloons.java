class Solution {
    public int maxNumberOfBalloons(String text) {
        int l=text.length();
        int freq[]=new int[26];
        for(int i=0;i<l;i++){
            freq[text.charAt(i)-'a']++;
        }
        return Math.min(
            Math.min(freq['b'-'a'], freq['a'-'a']),
            Math.min(
            Math.min(freq['l'-'a']/2, freq['o'-'a']/2),
            freq['n'-'a']
            )
        );
    }
}