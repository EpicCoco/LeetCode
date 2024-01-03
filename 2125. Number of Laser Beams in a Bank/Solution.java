class Solution {
    public int numberOfBeams(String[] bank) {
        int total = 0, prev = 0;
        for (int i = 0; i < bank.length; i++) {
            int numTraps = 0;
            char[] row = bank[i].toCharArray();
            for (char c : row) numTraps += c - '0';
            if (numTraps != 0) {
                total += numTraps * prev;
                prev = numTraps;
            } //if            
        } //for
        return total;
    } //numberOfBeans
} //Solution