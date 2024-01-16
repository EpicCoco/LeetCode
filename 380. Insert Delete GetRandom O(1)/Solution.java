class RandomizedSet {
    HashSet<Integer> set;
    public RandomizedSet() {
        set = new HashSet<>();
    } //RandomizedSet
    
    public boolean insert(int val) {
        return set.add(val);
    } //insert
    
    public boolean remove(int val) {
        return set.remove(val);
    } //remove
    
    public int getRandom() {
        ArrayList<Integer> temp = new ArrayList<>(set);
        return temp.get((int)(Math.random() * temp.size()));
    } //getRandom
} //Solution
