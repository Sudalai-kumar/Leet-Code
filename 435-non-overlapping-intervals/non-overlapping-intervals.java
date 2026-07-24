class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->
             a[0]-b[0]
        );
        int n=intervals.length;
        int removed=0;
        int pe=intervals[0][1];
        for(int i=1;i<n;i++){
            int s=intervals[i][0];
            int e=intervals[i][1];
            if(s<pe){
                removed++;
                pe=Math.min(pe,e);
            }else{
                pe=e;
            }
            // System.out.println(pe);
        }
        return removed;
    }
}