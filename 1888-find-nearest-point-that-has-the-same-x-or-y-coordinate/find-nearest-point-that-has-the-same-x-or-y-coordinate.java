class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int m=points.length;
        int n=points[0].length;
        int min=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<m;i++){
            int xi=points[i][0];
            int yi=points[i][1];
            if(xi==x){
                if(min>Math.abs(yi-y)){
                    min=Math.abs(yi-y);
                    index=i;
                }
            }
            if(yi==y){
                if(min>Math.abs(xi-x)){
                    min=Math.abs(xi-x);
                    index=i;
                }
            }
        }
        return index;
    }
}