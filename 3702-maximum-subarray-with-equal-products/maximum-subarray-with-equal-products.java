class Solution {
    private int GCD(int num1,int num2){
        while(num2>0){
            int temp=num1%num2;
            num1=num2;
            num2=temp;
        }
        return num1;
    }
    private int LCM(int num1,int num2){
        int lcm=Math.max(num1,num2);
        while(!(lcm%num1==0 && lcm%num2==0)){
            lcm++;
        }
        return lcm;
    }
    public int maxLength(int[] nums) {
        int n=nums.length;
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int l=1;
                int g=0;
                int p=1;
                for(int k=i;k<=j;k++){
                    p*=nums[k];
                    g=GCD(g,nums[k]);
                    l=LCM(l,nums[k]);
                }
                if(p==(l*g))res=Math.max(res,j-i+1);
            }
        }
        return res;
    }
}