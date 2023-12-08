class Solution {
    StringBuilder sb;
    public String tree2str(TreeNode root) {
        sb = new StringBuilder();
        rec(root);
        return sb.toString();
    } //tree2str

    private void rec(TreeNode root) {
        sb.append(root.val);
        if (root.left == null && root.right == null) return;
        sb.append("(");
        if (root.left != null) {
            rec(root.left);
        } //if
        sb.append(")");
        if (root.right != null) {
            sb.append("(");
            rec(root.right);
            sb.append(")");
        } //if
    } //rec
} //Solution