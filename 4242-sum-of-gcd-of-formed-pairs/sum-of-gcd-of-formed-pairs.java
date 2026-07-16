class Solution {
    private long Gcd(long a,long b){
        while(b!=0){
            long temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int n=nums.length;
        long prefixGcd[]=new long[n];
        long mxi=0;
        for(int i=0;i<n;i++){
            mxi=Math.max(mxi,nums[i]);
            prefixGcd[i]=Gcd(nums[i],mxi);
        }
        prefixGcd=Arrays.stream(prefixGcd).boxed().sorted(Comparator.reverseOrder()).mapToLong(Long::longValue).toArray();
        long sumGcd=0;
        for(int i=0;i<=n/2-1;i++){
            sumGcd+=Gcd(prefixGcd[i],prefixGcd[n-i-1]);
        }
        return sumGcd;
    }
}