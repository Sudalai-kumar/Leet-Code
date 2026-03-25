class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        long rowSum[]=new long[m];
        long sum=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum+=grid[i][j];
            }
            rowSum[i]=sum;
        }
        long colSum[]=new long[n];
        sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum+=grid[j][i];
            }
            colSum[i]=sum;
        }
        long total=rowSum[m-1];
        for(int i=0;i<m;i++){
           if(total-rowSum[i]==rowSum[i]) return true;
        }
        total=colSum[n-1];
        for(int i=0;i<n;i++){
           if(total-colSum[i]==colSum[i]) return true;
        }

        return false;
    }
}