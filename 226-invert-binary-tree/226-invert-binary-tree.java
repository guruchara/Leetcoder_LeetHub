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
    public TreeNode invertTree(TreeNode node) {
        if(node==null)
        {
            return null;
        }        
        TreeNode leftsub=invertTree(node.right);
        TreeNode rightsub=invertTree(node.left);        
        
        node.left=leftsub;
        node.right=rightsub;        
        return node;
    }
}