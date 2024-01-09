class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> treeOne = new ArrayList<>();
        ArrayList<Integer> treeTwo = new ArrayList<>();
        checkTree(root1, treeOne);
        checkTree(root2, treeTwo);
        return treeOne.toString().equals(treeTwo.toString());
    } //leafSimilar

    private void checkTree(TreeNode root, ArrayList<Integer> tree) {
        if (root == null) return;
        checkTree(root.left, tree);
        if (root.left == null && root.right == null) tree.add(root.val);
        checkTree(root.right, tree);
    } //checkTree
} //Solution