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
    public final TreeNode getTargetCopy(final TreeNode org, final TreeNode cln, final TreeNode k) {
        
        if(org==k || org==null)
        {
            return cln;
        }
        
        TreeNode lans=getTargetCopy(org.left,cln.left,k);
        
        if(lans!=null)
        {
            return lans;
        }
        
        return getTargetCopy(org.right,cln.right,k);
    }
}

