class Solution {
    public int numberOfSubstrings(String s) {
        int i=0;int j=0;
        int res=0;
        int l=s.length();
        HashMap<Character,Integer> count=new HashMap<>();
        while(j<l){
            count.put(s.charAt(j),count.getOrDefault(s.charAt(j),0)+1);
            while(count.size()==3){
                res+=l-j;
                count.put(s.charAt(i),count.getOrDefault(s.charAt(i),1)-1);
                if(count.get(s.charAt(i))==0){
                    count.remove(s.charAt(i));
                }
                i++;
            }
            j++;
        }
        return res;
    }
}