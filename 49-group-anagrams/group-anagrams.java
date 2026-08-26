class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String,List<String>> map=new HashMap<>();
        
        for(String word:strs){
            char arr[]=word.toCharArray();
            Arrays.sort(arr);
            String sword=new String(arr);
            if(!map.containsKey(sword)){
                map.put(sword,new ArrayList<>());
            }
            map.get(sword).add(word);
        }
        return new ArrayList<>(map.values());
    }
}