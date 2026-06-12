class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        ArrayList<Integer> res=new ArrayList<>();
        int row=0;
        int col=-1;
        int d=1; 
        while(m>0 && n>0){
            for(int i=0;i<n;i++){
                col+=d;
                res.add(matrix[row][col]);
            }
            m--;
            for(int i=0;i<m;i++){
                row+=d;
                res.add(matrix[row][col]);
            }
            n--;
            d*=-1;
        }
        return res;
    }
}