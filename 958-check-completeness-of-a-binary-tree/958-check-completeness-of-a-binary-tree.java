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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            
            TreeNode node = q.remove();
            
            // check if null then we will chech q is empty 
            if(node==null){
                
                if(!q.isEmpty() && q.peek()!=null)
                    return false;   
            }
            else{
                q.add(node.left);
                q.add(node.right);
            }
        }
        return true;
    }     
}