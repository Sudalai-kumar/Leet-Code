class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        boolean visited[][]=new boolean[m][n];
        boolean result=false;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0)){
                    result =backTrack(board,m,n,i,j,0,visited,word);
                    if(result) return true;
                }
            }
        }
        return false;
    }
    private boolean backTrack(char board[][],int m,int n,int i,int j,int index,boolean visited[][],String word){
            if(index==word.length()) return true;
            if(i<0||i>=m || j<0||j>=n || visited[i][j] || board[i][j]!=word.charAt(index)){
                return false;
            }
            visited[i][j]=true;
            if(backTrack(board,m,n,i+1,j,index+1,visited,word) ||
                backTrack(board,m,n,i-1,j,index+1,visited,word) ||
                backTrack(board,m,n,i,j+1,index+1,visited,word) ||
                backTrack(board,m,n,i,j-1,index+1,visited,word)
            ){
                return true;
            }

            visited[i][j]=false;
            return false;
        }
}