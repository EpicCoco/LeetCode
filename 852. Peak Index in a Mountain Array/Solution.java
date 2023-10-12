class Solution {

    int max;

    public int maxPathSum(TreeNode root) {
        max = root.val;
        pathSum(root);
        return max;
    } //maxPathSum

    private int pathSum(TreeNode root) {
        if (root == null) return 0;
        int left = pathSum(root.left);
        int right = pathSum(root.right);
        max = Math.max(max, (left < 0 ? 0 : left) + (right < 0 ? 0 : right) + root.val);
        return Math.max(Math.max(left, right), 0) + root.val;
    } //pathSum
} //Solution