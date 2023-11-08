class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if (sx == fx && sy == fy && t == 1) return false;
        if (dist(sx, sy, fx, fy) > t) return false;
        return true;
    } //isReachableAtTime

    private int dist(int a1, int a2, int b1, int b2) {
        int a = Math.abs(a1 - b1);
        int b = Math.abs(a2 - b2);
        int c = Math.abs(a - b);
        return Math.min(a, b) + c;
    } //dist
} //Solution