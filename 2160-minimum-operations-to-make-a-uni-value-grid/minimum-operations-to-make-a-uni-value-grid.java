class Solution {
    public int minOperations(int[][] grid, int x) {
        int m=grid.length;
        int n=grid[0].length;
        int arr[]=new int[m*n];
        int p=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[p]=grid[i][j];
                p++;
            }
        } 
        Arrays.sort(arr);
        int median=arr[(p-1)/2];
        int op=0;
        for(int i=0;i<p;i++){
            if(median>=arr[i]){
                if((median-arr[i])%x==0){
                    op+=(median-arr[i])/x;
                }
                else{
                    return -1;
                }
            }else{
                if((arr[i]-median)%x==0){
                    op+=(arr[i]-median)/x;
                }else{
                    return -1;
                }
            }
        }
        return op;
    }
}