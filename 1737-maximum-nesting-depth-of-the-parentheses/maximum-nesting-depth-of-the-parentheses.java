class Solution {
    public int maxDepth(String s) {
        Deque<Character> stack=new ArrayDeque<>();
        int depth=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }else if(s.charAt(i)==')'){
                if(!stack.isEmpty())
                    stack.pop();
            }
            depth=Math.max(depth,stack.size());
        }
        return depth;
    }
}