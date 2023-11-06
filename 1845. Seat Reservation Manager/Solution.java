class SeatManager {

    PriorityQueue<Integer> pq;

    public SeatManager(int n) {
        pq = new PriorityQueue<Integer>(n);
        for (int i = 1; i < n + 1; i++) pq.add(i);
    } //SeatManager
    
    public int reserve() {
        return pq.poll();
    } //reserve
    
    public void unreserve(int seatNumber) {
        pq.add(seatNumber);
    } //unreserve
} //Solution