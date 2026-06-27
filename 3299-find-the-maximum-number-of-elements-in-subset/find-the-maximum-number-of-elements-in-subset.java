class Solution {
    public int maximumLength(int[] nums) {
        int n=nums.length;
        if(n<=2)return 1;
        HashMap<Integer,Integer> count=new HashMap<>();
        for(int i=0;i<n;i++){
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
        }
        int maxLen=0;
        for(Map.Entry<Integer,Integer> entry:count.entrySet()){
            int val=entry.getKey();
            if (val == 1) {
                int freq = entry.getValue();
                maxLen = Math.max(maxLen, freq % 2 == 0 ? freq - 1 : freq);
                continue;
            }
            int len=1;
            // System.out.println(val);
            while(true){
                int root = (int)Math.sqrt(val);
                if (root * root != val)
                    break;
                if (count.getOrDefault(root, 0) < 2)
                    break;
                val = root;
                len += 2;
            }
            maxLen=Math.max(len,maxLen);
        }
        return maxLen;
    }
}