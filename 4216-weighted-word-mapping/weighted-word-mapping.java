class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int l=words.length;
        String res="";
        for(int i=0;i<l;i++){
            int sum=0;
            for(char ch:words[i].toCharArray()){
                sum+=weights[ch-'a'];
            }
            res+=(char)(122-sum%26);
        }
        return res;
    }
}