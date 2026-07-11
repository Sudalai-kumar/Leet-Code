class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            int a=edge[0];
            int b=edge[1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        int ans=0;
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                int []vande=new int[2];
                dfs(i,visited,vande,graph);
                int vertexCount=vande[0];
                int edgeCount=vande[1]/2;
                if(edgeCount == vertexCount*(vertexCount-1)/2)
                    ans++;
            }
        }
        return ans;
    }
    private void dfs(int i,boolean []visited,int []vande,List<List<Integer>> graph){

        if(!visited[i]){
            vande[0]++;
            vande[1]+=graph.get(i).size();
            visited[i]=true;
            for(int nei : graph.get(i)){
                if(!visited[nei]){
                    dfs(nei, visited, vande, graph);
                }   
            }
        }
    }
}