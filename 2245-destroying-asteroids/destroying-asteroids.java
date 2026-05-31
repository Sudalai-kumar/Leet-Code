class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long mas=mass;
        Arrays.sort(asteroids);
        int n=asteroids.length;
        for(int i=0;i<n;i++){
            if(asteroids[i]<=mas){
                mas+=asteroids[i];
            }else{
                return false;
            }
        }
        return true;
    }
}