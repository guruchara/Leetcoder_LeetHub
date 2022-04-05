/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode node, TreeNode p, TreeNode q) {        
        
   
        TreeNode curr=node;
        while(curr!=null)
        {
        // kabh p or q dono ki value node ki value se chhoti rhti he to hm  left ko return kr denge
          if(p.val<curr.val && q.val < curr.val)
          {
              curr=curr.left;
          }
        // kabhi p or q ki value node.val se badi he to us case me right ka node return krenge
        else if(p.val>curr.val && q.val>curr.val)
        {
            curr=curr.right;
        }
        else
        {
             return curr;
        }
        }
        return null;
    }
}
        