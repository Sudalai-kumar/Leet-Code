class Solution {
    public int maxNumberOfBalloons(String text) {
        int l=text.length();
        int freq[]=new int[26];
        for(int i=0;i<l;i++){
            if(text.charAt(i)=='b' || text.charAt(i)=='a'|| text.charAt(i)=='l'|| text.charAt(i)=='o'|| text.charAt(i)=='n')
            freq[text.charAt(i)-'a']++;
        }
        freq['l'-'a']/=2;
        freq['o'-'a']/=2;
        if(freq['b'-'a']==0 ||freq['a'-'a']==0 ||freq['l'-'a']==0 ||freq['o'-'a']==0 ||freq['n'-'a']==0) return 0;
        int minCount=Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                minCount=Math.min(freq[i],minCount);
            }
        }
        return minCount;
    }
}