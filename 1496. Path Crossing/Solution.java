class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String> moves = new HashSet<>();
        int[] coords = new int[]{0, 0};
        moves.add("0 0");
        for (char c : path.toCharArray()) {
            if (c == 'N') coords[1]++;
            else if (c == 'E') coords[0]++;
            else if (c == 'S') coords[1]--;
            else coords[0]--;
            if (!moves.add(new StringBuilder().append(coords[0]).append(" ").append(coords[1]).toString())) return true;
        } //for
        return false;
    } //isPathCrossing
} //Solution