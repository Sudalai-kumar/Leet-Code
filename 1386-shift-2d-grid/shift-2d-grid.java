class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;

        List<List<Integer>> res=new ArrayList<>();
        
        for(int l=0;l<k;l++){
            int temp[][]=new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n-1;j++){
                    temp[i][j+1]=grid[i][j];
                }
            }
            for(int i=0;i<m-1;i++){
                temp[i+1][0]=grid[i][n-1];
            }
            temp[0][0]=grid[m-1][n-1];
            grid=temp;
        }
        for(int i=0;i<m;i++){
            List<Integer> row=new ArrayList<>();
            res.add(row);
            for(int j=0;j<n;j++){
                row.add(grid[i][j]);
            }
        }
        return res;
    }
}