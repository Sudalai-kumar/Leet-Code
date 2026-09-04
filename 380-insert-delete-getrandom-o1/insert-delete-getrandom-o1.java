class RandomizedSet {
    Set<Integer> rs;
    Random rd=new Random();
    public RandomizedSet() {
        rs=new HashSet<>();
    }
    
    public boolean insert(int val) {
        if(!rs.contains(val)){
            rs.add(val);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(rs.contains(val)){
            rs.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        int ri=rd.nextInt(rs.size());
        int r=rs.stream().skip(ri).findFirst().get();
        return r;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */