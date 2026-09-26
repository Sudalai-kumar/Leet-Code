class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map=new HashMap<>();
        
        for(int i=0;i<knowledge.size();i++){   
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        StringBuilder res=new StringBuilder();
        int n=s.length();
        int i=0;
        while(i<n){
            if(s.charAt(i)=='('){
                StringBuilder str=new StringBuilder();
                while(s.charAt(++i)!=')'){
                    str.append(s.charAt(i));
                }
                if(map.get(str.toString())!=null)
                    res.append(map.get(str.toString()));
                else
                    res.append("?");
            }else{
                res.append(s.charAt(i));
            }
            i++;
        }
        return res.toString();
    }
}