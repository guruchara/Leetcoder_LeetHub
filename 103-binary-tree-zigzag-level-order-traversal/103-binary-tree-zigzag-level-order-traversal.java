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
    public List<List<Integer>> zigzagLevelOrder(TreeNode node) {
        if(node==null)
        {
           return new ArrayList<>();
        }
        
        List<List<Integer>>lm=new ArrayList<>();
        Queue<TreeNode>q=new ArrayDeque<>();
        q.add(node);
        int c=0;
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
                        
            if((c%2==0))
            {
                lm.add(l);
                System.out.print(l +" ");
            }
            else
            {
                // Collections.sort(l,Collections.reverseOrder());
                // System.out.print(l+ " ");
                ArrayList<Integer>temp=new ArrayList<>();
                for(int i=l.size()-1;i>=0;i--)
                {
                    temp.add(l.get(i));
                }
                lm.add(temp);
            }
            c++;
        }
        
        return lm;
    }
}