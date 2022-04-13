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
    public ArrayList<TreeNode>l=new ArrayList<>();
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
   TreeNode BTS(int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        TreeNode root = l.get(mid);
        root.left = BTS(start, mid - 1);
        root.right = BTS(mid + 1, end);
        return root;
   }
    
       TreeNode balanceBST(TreeNode node) {
        
        
        inorder(node);
        return BTS(0,l.size()-1);
    }
}