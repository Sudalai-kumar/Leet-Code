class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int l=arr.length;

        HashMap<Integer,Integer> tr=new HashMap<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<l;i++){
            pq.add(arr[i]);
        }
        int res[]=new int[l];
        int rank = 1;
        while(!pq.isEmpty()){
            int x = pq.poll();
            if(!tr.containsKey(x)){
                tr.put(x, rank);
                rank++;
            }
        }
        for(int i=0;i<l;i++){
            res[i]=tr.get(arr[i]);
        }
        return res;
    }
}