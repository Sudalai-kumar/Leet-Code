class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        if(words.length!=pattern.length()) return false;
        HashMap<Character,String> map=new HashMap<>();
        Set<String> seen=new HashSet<>();
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String w=words[i];
             if (map.containsKey(ch)) {
                if (!map.get(ch).equals(w)) {
                    return false;}
            } else {
                if (seen.contains(w)) {
                    return false;
                }
            }
            map.put(ch,w);
            seen.add(w);
        }
        return true;
    }
}