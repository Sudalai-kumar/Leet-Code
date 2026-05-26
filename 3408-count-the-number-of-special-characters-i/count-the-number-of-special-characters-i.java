class Solution {
    public int numberOfSpecialChars(String word) {
        int countsmall[]=new int[27];
        int countcap[]=new int[27];
        int n=word.length();
        char arr[]=word.toCharArray();
        for(int i=0;i<n;i++){
            if(arr[i]>='a'&& arr[i]<='z'){
                countsmall[(arr[i]-'a')]++;
            }else if(arr[i]>='A'&& arr[i]<='Z'){
                countcap[(arr[i]-'A')]++;
            }
        }
        int res=0;
        for(int i=0;i<27;i++){
            if(countsmall[i]>0 && countcap[i]>0){
                res+=1;
            }
        }
        return res;
    }
}