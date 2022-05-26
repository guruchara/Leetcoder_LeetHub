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
    int max;
    
    public int rootToNodeMax(TreeNode node){
        if(node==null) return 0;
        
        int maxLeftPathSum = Math.max(0,rootToNodeMax(node.left));
        int maxRightPathSum = Math.max(0,rootToNodeMax(node.right));
        
        max = Math.max(max,maxLeftPathSum+maxRightPathSum+node.val); // comparing with complete path(left+node+right)
            
        return Math.max(maxLeftPathSum,maxRightPathSum)+node.val; // returning maxPath 
    }
    
    public int maxPathSum(TreeNode root) {
        // to get max node to node you must calculate left max path to node and right max path to node
        // max(node,node) = max(leftpathToNode)+max(rightpathToNode)+node;    for every node
        max = Integer.MIN_VALUE;
        rootToNodeMax(root);
        return max;
    }
}