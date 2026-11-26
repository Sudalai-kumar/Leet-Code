class Solution {
    public boolean canAliceWin(int n) {
        if(n<10) return false;
        boolean alice=true;
        n=n-10;
        for(int i=9;i>0;i--){
            if(n<i){
                return alice;
            }
            // System.out.println(n+" "+alice);
            alice=alice?false:true;
            n-=i;
        }
        return alice;
    }
}