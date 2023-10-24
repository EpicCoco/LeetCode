/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> toReturn = new ArrayList<Integer>();
        if (root == null) return toReturn;
        levelMax(root, toReturn, 0);
        return toReturn;
    } //largestValues

    private void levelMax(TreeNode root, List<Integer> toReturn, int level) {
        if (toReturn.size() <= level) toReturn.add(root.val);
        else toReturn.set(level, Math.max(root.val, toReturn.get(level)));
        if (root.left != null) levelMax(root.left, toReturn, level + 1);
        if (root.right != null) levelMax(root.right, toReturn, level + 1);
    } //levelMax
} //Solution