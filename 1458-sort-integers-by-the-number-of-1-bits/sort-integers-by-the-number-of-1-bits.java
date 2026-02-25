class Solution {
    // private int bitCount(int n){
    //     int count=0;
    //     while (n!=0){
    //         n=n & (n-1);
    //         count++;
    //     }
    //     return count;
    // }
    public int[] sortByBits(int[] arr) {
        Integer[] temp=Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(temp,(a,b)->{
            int countA=Integer.bitCount(a);
            int countB=Integer.bitCount(b);
            if(countA==countB){
                return a-b;
            }
            return countA-countB;
        });
        return Arrays.stream(temp).mapToInt(Integer::intValue).toArray();    
    }
}