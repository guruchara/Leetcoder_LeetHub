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
    
    ArrayList<TreeNode>l=new ArrayList<>();
    public void inorder(TreeNode node)
    {
        if(node==null)
        {
            return;
        }
        
        inorder(node.left);
        l.add(node);
        inorder(node.right);
    }
    public TreeNode increasingBST(TreeNode node) {
        
        inorder(node);
        
        TreeNode temp=null;
        for(int i=0;i<l.size();i++)
        {           
            temp=l.get(i);
            temp.left=null;
            
            if(i<l.size()-1)
            {
               temp.right=(l.get(i+1));
            }
        }
        return l.get(0);
    }
}