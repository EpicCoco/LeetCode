class Solution {
    int[][] dirs = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public int islandPerimeter(int[][] grid) {
        int numEdges = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) continue;
                for (int[] dir : dirs) {
                    int x = i + dir[0];
                    int y = j + dir[1];
                    if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length) numEdges++;
                    else if (grid[x][y] == 0) numEdges++;
                } //for
            } //for
        } //for
        return numEdges;
    } //islandPerimeter
} //Solution