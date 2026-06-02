class Solution {
    public int earliestFinishTime(int[] lst, int[] ld, int[] wst, int[] wd) {
        int early=Integer.MAX_VALUE;
        for(int i=0;i<lst.length;i++){
            for(int j=0;j<wst.length;j++){
                int plan1=Math.max(lst[i]+ld[i],wst[j])+wd[j];
                int plan2=Math.max(wst[j]+wd[j],lst[i])+ld[i];
                early=Math.min(early,Math.min(plan1,plan2));
            }
        }
        return early;
    }
}