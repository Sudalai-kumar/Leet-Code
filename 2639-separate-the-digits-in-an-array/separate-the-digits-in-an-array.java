class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int len=nums.length;
        for(int i=0;i<len;i++){
            int num=nums[i];
            ArrayList<Integer> digits=new ArrayList<>();
            while(num>0){
                int digit=num%10;
                digits.add(digit);
                num/=10;
            }
            for(int j=digits.size()-1;j>=0;j--){
                list.add(digits.get(j));
            }
        }
        int l=list.size();
        int res[]=new int[l];
        for(int i=0;i<l;i++){
            res[i]=list.get(i);
        }
        return res;
    }
}