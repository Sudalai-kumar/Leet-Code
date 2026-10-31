class Solution {
    int dp[][][];
    static final int MOD = 1_000_000_007;
    public int uniquePaths(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        dp=new int[n][m][2];
        for (int[][] row : dp) {
            for (int[] cell : row) {
                Arrays.fill(cell, -1);
            }
        }
        int count=dfs(0,0,n,m,grid,0);
        return count;
    }
    private int dfs(int i,int j,int n,int m,int [][]grid,int prev){
        if(i<0 || i>=n || j<0 || j>=m){
            return 0;
        }
        if(i==n-1 && j==m-1) return 1;
        if(dp[i][j][prev]!=-1){
            return dp[i][j][prev];
        }
        long count = 0;
        if(grid[i][j]==0){
            count+=dfs(i,j+1,n,m,grid,0);
            count+=dfs(i+1,j,n,m,grid,1);
        }else{
            if(prev==0){
                count+=dfs(i+1,j,n,m,grid,1);
            }else
                count+=dfs(i,j+1,n,m,grid,0);
        }
        return dp[i][j][prev]=(int) (count % MOD);
    }
}