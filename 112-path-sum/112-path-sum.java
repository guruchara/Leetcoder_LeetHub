class Solution {
     
     public boolean hasPathSum(TreeNode root, int k) {
         if(root==null)
         {
            return false;
         }
        
         if(root.left==null && root.right==null)
         {
             return k-root.val==0;
         }
        return hasPathSum(root.left,k-root.val) || hasPathSum(root.right,k-root.val);
    }
}