class Solution {
    static int min=Integer.MAX_VALUE;
    public int minScore(int n, int[][] roads) {
        
        List<List<int[]>> graph=new ArrayList<>();
        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<>());
        }
        int m=roads.length;
        for(int i=0;i<m;i++){
            int a=roads[i][0],b=roads[i][1],d=roads[i][2];
            graph.get(a).add(new int[]{b,d});
            graph.get(b).add(new int[]{a,d});
        }        
        boolean visited[]=new boolean[n+1];
        min = Integer.MAX_VALUE;
        dfs(graph,1,visited);
        // System.out.println(min);
        return min;
    }
    private void dfs(List<List<int[]>> graph,int s,boolean visited[]){
        visited[s]=true;
        for(int i=0;i<graph.get(s).size();i++){
            min=Math.min(min,graph.get(s).get(i)[1]);
            // System.out.println(min);
            if(!visited[graph.get(s).get(i)[0]])
                dfs(graph,graph.get(s).get(i)[0],visited);
        }
    }
}