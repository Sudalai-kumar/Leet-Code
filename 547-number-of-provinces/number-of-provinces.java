class Solution {
    public int findCircleNum(int[][] isConnected) {
        int m=isConnected.length;
        int n=isConnected[0].length;
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<m;i++){
            graph.add(new ArrayList<>());
        } 

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i!=j && isConnected[i][j]==1){
                    graph.get(i).add(j);
                    
                }
            }
        }
        boolean visited[]=new boolean[n];
        int provinces=0;
        for(int node=0;node<m;node++){
            if(!visited[node]){
                provinces++;
                dfs(node,graph,visited);
            }
        }
        return provinces;
    }
    private void dfs(int node,List<List<Integer>> graph,boolean visited[]){
        visited[node]=true;
        for(int n:graph.get(node)){
            if(!visited[n])
                dfs(n,graph,visited);
        }
    }
}