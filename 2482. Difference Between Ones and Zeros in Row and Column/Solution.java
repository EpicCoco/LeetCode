class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] toReturn = new int[m][n];
        int[] colTotal = new int[m];
        int[] rowTotal = new int[n];        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                colTotal[i] += (grid[i][j] == 1 ? 1 : -1);
                rowTotal[j] += (grid[i][j] == 1 ? 1 : -1);
            } //for
        } //for
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                toReturn[i][j] = colTotal[i] + rowTotal[j];
            } //for
        } //for
        return toReturn;
    } //onesMinusZeroes    
} //Solution