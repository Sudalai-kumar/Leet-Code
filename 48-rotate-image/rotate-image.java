class Solution {
    public void rotate(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=m-1;j>=0;j--){
                list.add(matrix[j][i]);
            }
        }
        int k=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=list.get(k);
                k++;
            }
        }
    }
}