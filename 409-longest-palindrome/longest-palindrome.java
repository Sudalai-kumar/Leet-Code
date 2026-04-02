class Solution {
    public int longestPalindrome(String s) {
        char arr[]=s.toCharArray();
        HashMap<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
        }
        int res=0;
        for(int val:freq.values()){
            if(val%2==0){
                res+=val;
            }
            else{
                res+=val-1;
            }
        }
        return res==arr.length?res:res+1; 
    }
}