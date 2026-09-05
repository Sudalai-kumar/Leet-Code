class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int gasLeft=0;
        int startIdx=0;
        int total=0;
        int net=0;
        for(int i=0;i<n;i++){
            net=gas[i]-cost[i];
            gasLeft+=net;
            total+=net;
            if(gasLeft<0){
                startIdx=i+1;
                gasLeft=0;
            }
        }
        if(total<0) return -1;
        return startIdx;
    }
}