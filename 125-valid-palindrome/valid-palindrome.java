class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        char arr[]=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(((arr[i]>=97 && arr[i]<=122) || (arr[i]>=48 &&arr[i]<=57))){
                sb.append(arr[i]);
            }
        }
        int l=0,r=sb.length()-1;
        while(l<r) {
            if(sb.charAt(l)!=sb.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}