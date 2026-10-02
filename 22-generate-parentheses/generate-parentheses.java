class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        backTrack(res,"",0,0,n);
        return res;
    }
    private void backTrack(List<String> res,String r,int open,int close,int n){
        if(r.length()==2*n){
            res.add(r);
            return;
        }
        if(open<n){
            backTrack(res,r+'(',open+1,close,n);
        }
        if(close<open){
            backTrack(res,r+')',open,close+1,n);
        }
    }
}