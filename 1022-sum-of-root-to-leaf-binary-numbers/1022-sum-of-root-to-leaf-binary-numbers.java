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
class Solution{
public int sumRootToLeaf(TreeNode node) {
        return dfs(node, 0);
    }

    public int dfs(TreeNode node, int val) {
        
        if (node == null) return 0;
        
        val = val * 2 + node.val;
        
        return node.left == node.right ? val : dfs(node.left, val) + dfs(node.right, val);
    }
}