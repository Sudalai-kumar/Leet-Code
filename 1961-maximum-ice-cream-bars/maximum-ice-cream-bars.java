class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int freq[]=new int[100001];

        for(int i=0;i<costs.length;i++){
            freq[costs[i]]++;
        }
        int count=0;
        for(int i=1;i<=100000;i++){
            while(i<=coins && freq[i]!=0){
                coins-=i;
                count+=1;
                freq[i]--;
            }
        }
        return count;
    }
}