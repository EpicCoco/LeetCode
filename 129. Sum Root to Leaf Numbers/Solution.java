class Solution {
    int total;

    public int sumNumbers(TreeNode root) {
        total = 0;
        sum(root, 0);
        return total;
    } //sumNumbers

    private void sum(TreeNode root, int val) {
        if (root == null) return;
        val = (val * 10) + root.val;
        if (root.left == null && root.right == null) total += val;
        sum(root.left, val);
        sum(root.right, val);
    } //sum
} //Solution