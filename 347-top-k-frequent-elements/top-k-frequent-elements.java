class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        int n=nums.length;
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        Map<Integer,Integer> sortedMap=freq.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .collect(Collectors.toMap(
            Map.Entry::getKey,
            Map.Entry::getValue,
            (e1,e2)->e1,
            LinkedHashMap::new
        ));
        int res[]=new int[k];
        int i=0;
        for(Map.Entry<Integer,Integer> entry:sortedMap.entrySet()){
            if(i<k){
                res[i++]=entry.getKey();
            }
        }
        return res;
    }
}