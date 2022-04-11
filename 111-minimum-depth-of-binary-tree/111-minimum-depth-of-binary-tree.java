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
    public int minDepth(TreeNode node) {
        if(node==null)
        {
            return 0;
        }
        
        Queue<TreeNode>q=new ArrayDeque<>();
        q.add(node);
        
        int depth=1;
        while(q.size()>0)
        {
            int k=q.size();
            for(int i=0;i<k;i++)
            {
                node=q.remove();
                if(node.left==null && node.right==null)
                {
                    return depth++;
                }
                
                if(node.left!=null)
                {
                    q.add(node.left);
                }
                
                if(node.right!=null)
                {
                    q.add(node.right);
                }
            }
            depth++;
        }
           return depth;
        }
}