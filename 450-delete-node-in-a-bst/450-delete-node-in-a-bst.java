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
    public int maval(TreeNode node)
    {
    // we already known top elements are present in right side of Binary Search Tree.
         TreeNode curr=node;
        while(curr.right!=null)
        {
            curr=curr.right;
        }
        return curr.val;
    }
    public TreeNode deleteNode(TreeNode node, int val) {
        if(node==null)
         {
             return null;
         }
         
         if(val<node.val)
         {
             node.left=deleteNode(node.left,val);
         }
         else if(val>node.val)
         {
             node.right=deleteNode(node.right,val);
         }
         // if 0 child then 
         else if(node.left==null)
         {
             return node.right;
         }
         else if(node.right==null)
         {
             return node.left;
         }
         else
         {
             //if only 2 child then  we find maval from left side of tree.
             int maxl=maval(node.left);
             // mavall ko node.vale assign kr denge
             node.val=maxl;
             // hmko left vale me se delete krna he
             node.left=deleteNode(node.left,maxl);
         }
         return node;
    }
}