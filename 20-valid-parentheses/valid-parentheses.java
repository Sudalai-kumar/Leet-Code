class Solution {
    public boolean isValid(String s) {
        int l=s.length();
        if(l<2) return false;
        char br[]=s.toCharArray();
        ArrayList<Character> stack=new ArrayList<>();
        for(int i=0;i<l;i++){
            if(br[i]=='(' || br[i]=='[' || br[i]=='{'){
                stack.add(br[i]);
            }
            else{
                int top=stack.size()-1;
                if(top==-1) return false;
                if(br[i]==')' && stack.get(top)=='('){
                    stack.remove(top);
                }else if(br[i]==']' && stack.get(top)=='['){
                    stack.remove(top);
                }else if(br[i]=='}' && stack.get(top)=='{'){
                    stack.remove(top);
                }
                else{
                    return false;
                }
            }
        }
        if(stack.size()!=0) return false;
        return true;
    }
}