class Solution {
    public String longestCommonPrefix(String[] strs) {
        int l=strs.length;
        Arrays.sort(strs);
        StringBuilder sb=new StringBuilder(strs[0]);
        for(int i=0;i<l;i++){
            while(!strs[i].startsWith(sb.toString())){
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }
}