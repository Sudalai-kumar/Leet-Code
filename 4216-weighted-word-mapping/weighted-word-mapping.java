class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int l=words.length;
        StringBuilder res=new StringBuilder();
        for(int i=0;i<l;i++){
            int sum=0;
            for(char ch:words[i].toCharArray()){
                sum+=weights[ch-'a'];
            }
            res.append((char)(122-sum%26));
        }
        return res.toString();
    }
}