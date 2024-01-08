class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;
        int total = rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
        if (root.val >= low && root.val <= high) total += root.val;
        return total;
    } //rangeSumBST
} //Solution