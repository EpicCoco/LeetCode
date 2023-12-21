class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            } //compare
        });
        int maxDist = 0;
        for (int i = 0; i < points.length - 1; i++) {
            maxDist = Math.max(maxDist, points[i + 1][0] - points[i][0]);
        } //for
        return maxDist;
    } //maxWidthOfVerticalArea
} //Solution