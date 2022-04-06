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
    public int res=0;
    public int rangeSumBST(TreeNode node, int low, int high) {
        if(node==null)        
        {
            return 0;
        }
        
        if(node.val<=high && node.val>=low)
        {
            res+=node.val;
        }
        
        rangeSumBST(node.left,low,high);
        rangeSumBST(node.right,low,high);
        return res;
    }
}