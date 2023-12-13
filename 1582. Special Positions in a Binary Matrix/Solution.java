class Solution {
    public int numSpecial(int[][] mat) {
        int[] col = new int[mat.length];
        int[] row = new int[mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    col[i] += mat[i][j];
                    row[j] += mat[i][j];
                } //if
            } //for
        } //for
        int total = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) total += (col[i] == 1 && row[j] == 1) ? 1 : 0;
            } //for
        } //for
        return total;
    } //numSpecial
} //Solution