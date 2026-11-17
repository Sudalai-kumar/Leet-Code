class Solution {
    public int closedIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            if(grid[i][0]==0){
                dfs(i,0,grid);
            }if(grid[i][m-1]==0){
                dfs(i,m-1,grid);
            }
        }
        for(int i=0;i<m;i++){
            if(grid[0][i]==0){
                dfs(0,i,grid);
            }if(grid[n-1][i]==0){
                dfs(n-1,i,grid);
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                    count++;
                    dfs(i,j,grid);
                }
            }
        }
        return count;
    }
    private void dfs(int i,int j,int [][]grid){
        if(i>=grid.length || i<0 || j>=grid[0].length || j<0 || grid[i][j]==1){
            return;
        }
        grid[i][j]=1;
        dfs(i+1,j,grid);
        dfs(i,j+1,grid);
        dfs(i-1,j,grid);
        dfs(i,j-1,grid);
    }
}