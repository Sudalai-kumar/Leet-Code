class Solution {
    public int numberOfSpecialChars(String word) {
        int n=word.length();
        char arr[]=word.toCharArray();
        HashMap<Integer,Integer> ap=new HashMap<>();
        HashMap<Integer,Integer> fap=new HashMap<>();
        int countL[]=new int[26];
        int countA[]=new int[26];
        for(int i=0;i<n;i++){
            if(arr[i]>='a' && arr[i]<='z'){
                countL[arr[i]-'a']++;
                ap.put((int)arr[i],i);
            }
        }
        for(int i=0;i<n;i++){
            int lower = arr[i] + 32;
            if(!fap.containsKey((int)arr[i])) {
                fap.put((int)arr[i], i);
            }
            if(ap.containsKey(lower) && ap.get(lower)<fap.get((int)arr[i])) {
                countA[arr[i]-'A'] = 1;
            }
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(countL[i]>0 && countA[i]>0){
                count++;
            }
        }
        return count;
    }
}