class Solution {
    String min = "zzzzzzzzz";
    
    public String smallestFromLeaf(TreeNode root) {
        findSmallest(root, "");
        return min;
    } //smallestFromLeaf

    private void findSmallest(TreeNode root, String str) {
        if (root == null) return;
        StringBuilder sb = new StringBuilder(str);
        sb.insert(0, (char)(root.val + 'a'));
        String s = sb.toString();
        if (root.left == null && root.right == null) {
            if (s.compareTo(min) < 0) min = s;
            return;
        } //if
        findSmallest(root.left, s);
        findSmallest(root.right, s);
    } //findSmallest
} //Solution