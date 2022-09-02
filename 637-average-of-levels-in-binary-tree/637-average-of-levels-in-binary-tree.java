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
     public List<Double> averageOfLevels(TreeNode node) {
        
        if(node==null)
        {
            return new ArrayList<Double>();
        }
        
        Queue<TreeNode>q=new ArrayDeque<>();
        
        q.add(node);
        
        List<Double>p=new ArrayList<>();
        
        while(q.size()>0)
        {
            int c=q.size();
            
            List<Integer>l=new ArrayList<>();
            
            for(int i=0;i<c;i++)
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
            
            long sum=0;
            for(int val:l)
            {
                sum+=val;
            }
            double x=(double)sum/l.size();
            p.add(x);
        }
        return p;
    }
}