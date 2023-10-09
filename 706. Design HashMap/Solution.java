class MyHashMap {

    int[] array;

    public MyHashMap() {
        array = new int[1000001];
    } //MyHashMap
    
    public void put(int key, int value) {
        array[key] = value + 1;
    } //put
    
    public int get(int key) {
        return array[key] - 1;
    } //get
    
    public void remove(int key) {
        array[key] = 0;
    } //remove
} //MyHashMap
