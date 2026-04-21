class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int rarr[]=new int[m];
        int carr[]=new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    rarr[i]=1;
                    carr[j]=1;
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(rarr[i]==1||carr[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}