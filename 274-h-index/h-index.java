class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int len=citations.length;
        int hi=0;
        for(int i=len-1;i>=0;i--){
            if(citations[i]>=len-i){
                hi=len-i;
            }
        }
        return hi;
    }
}