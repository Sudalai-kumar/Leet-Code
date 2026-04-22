class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> prev=new ArrayList<>();
        prev.add(1);
        res.add(prev);
        for(int i=1;i<numRows;i++){
            List<Integer> cur=new ArrayList<>();
            cur.add(1);
            for(int j=1;j<i;j++){
                int ele=prev.get(j-1)+prev.get(j);
                cur.add(ele);
            }
            cur.add(1);
            res.add(cur);
            prev=cur;
        }
        return res;
    }
}