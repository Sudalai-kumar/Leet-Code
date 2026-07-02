class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m=grid.size();
        int n=grid.get(0).size();
        int bestHealth[][]=new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(bestHealth[i], -1);
        }
        return dfs(0,0,m,n,grid,bestHealth,health);
    }
    private boolean dfs(int i,int j,int m,int n,List<List<Integer>> grid,int bestHealth[][],int health){
        if(i<0||i>=m || j<0||j>=n  ){
            return false;
        }
        if (health <= bestHealth[i][j]) {
            return false;
        }
        bestHealth[i][j] = health;
        if(grid.get(i).get(j)==1){
            health--;
        }
        if(health<=0){
            return false;
        }
        if (i == m - 1 && j == n - 1)
            return true;
        boolean res=dfs(i+1,j,m,n,grid,bestHealth,health) ||
            dfs(i-1,j,m,n,grid,bestHealth,health) ||
            dfs(i,j+1,m,n,grid,bestHealth,health)||
            dfs(i,j-1,m,n,grid,bestHealth,health);
        return res;
    }
}