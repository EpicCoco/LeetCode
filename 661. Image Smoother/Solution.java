class Solution {
    public int[][] imageSmoother(int[][] img) {
        int[][] offsets = new int[][] {{-1, 1}, {-1, 0}, {-1, -1}, {0, 1}, {0, 0}, {0, -1}, {1, 1}, {1, 0}, {1, -1}};
        int n = img.length, m = img[0].length;
        int[][] toReturn = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int total = 0, count = 0;
                for (int[] offset : offsets) {
                    int[] pos = new int[] {offset[0] + i, offset[1] + j};
                    if (pos[0] > -1 && pos[1] > -1 && pos[0] < n && pos[1] < m) {
                        total += img[pos[0]][pos[1]];
                        count++;
                    } //if
                } //for
                toReturn[i][j] = (int)(total / count);
            } //for
        } //for
        return toReturn;
    } //imageSmoother
} //Solution