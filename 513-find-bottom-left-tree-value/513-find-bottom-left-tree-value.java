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
    public int findBottomLeftValue(TreeNode node) {
        if(node==null)
        {
            return 0;
        }
        
        ArrayList<ArrayList<Integer>>lm=new ArrayList<>();
        Queue<TreeNode>q=new ArrayDeque<>();
        q.add(node);
        
        while(q.size()>0)
        {
            int k=q.size();
            
            ArrayList<Integer>l=new ArrayList<>();
            for(int i=0;i<k;i++)
            {
                node=q.remove();
                l.add(node.val);
                
                if(node.left!=null)
                {
                    q.add(node.left);
                }
                
                if(node.right!=null)
                {
                    q.add(node.right);
                }
            }
           lm.add(l);
        }
        ArrayList<Integer>temp=lm.get(lm.size()-1);
        return temp.get(0);
    }
}