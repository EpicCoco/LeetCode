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
    int count = 0;
    public int averageOfSubtree(TreeNode root) {
        checkSubtree(root);
        return count;
    } //averageOfSubtree

    //use array - int[0] = total sum of all sub nodes, int[1] = numNodes
    private int[] checkSubtree(TreeNode root) {
        if (root == null) return new int[] {0, 0};
        int[] left = checkSubtree(root.left);
        int[] right = checkSubtree(root.right);
        int numNodes = left[1] + right[1] + 1;
        int total = left[0] + root.val + right[0];
        int average = total / numNodes;
        if (average == root.val) count++;
        return new int[] {total, numNodes};
    } //checkSubtree
} //Solution