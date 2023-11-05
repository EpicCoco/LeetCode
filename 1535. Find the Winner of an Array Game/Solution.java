class Solution {
    public int getWinner(int[] arr, int k) {
        //case that k > arr.length: return biggest element
        if (k > arr.length) return Arrays.stream(arr).max().getAsInt();
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i : arr) queue.add(i);
        int winner = 0;
        int num = queue.poll();
        while (1==1) {
            int next = queue.poll();
            if (num > next) {
                queue.add(next);
                winner++;
            } else {
                queue.add(num);
                num = next;
                winner = 1;
            } //if
            if (winner == k) return num;
        } //while
    } //getWinner 
} //Solution