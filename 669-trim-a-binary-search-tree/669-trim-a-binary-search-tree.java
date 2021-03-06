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
    public TreeNode trimBST(TreeNode node, int low, int high) {
        
         if(node==null)
         {
             return null;
         }
       if(low>node.val)
       {
           return trimBST(node.right,low,high) ; 
       }
        
        if(high<node.val)
        {
            return trimBST(node.left,low,high);
        }
        
        node.left=trimBST(node.left,low,high);
        node.right=trimBST(node.right,low,high);
        return node;
    }
}