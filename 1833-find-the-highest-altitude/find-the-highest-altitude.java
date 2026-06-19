class Solution {
    public int largestAltitude(int[] gain) {
        int high=0;
        int maxAlt=0;
        for(int i=0;i<gain.length;i++){
            high+=gain[i];
            maxAlt=Math.max(maxAlt,high);
            if(maxAlt<0) maxAlt=0;
        }
        return maxAlt;
    }
}