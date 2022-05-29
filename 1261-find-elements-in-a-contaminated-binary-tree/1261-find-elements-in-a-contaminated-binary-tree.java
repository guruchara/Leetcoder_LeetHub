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
class FindElements {

    HashSet<Integer>h;
    
    public FindElements(TreeNode node) {
       h=new HashSet<>();
       
      recover(node,0);
    }
    
    public void recover(TreeNode node,int val)
    {
        if(node==null)
        {
            return;
        }
        h.add(val);
        node.val=val;
        
        recover(node.left,2*val+1);
        recover(node.right,2*val+2);
        
    }
    public boolean find(int tar) {
        
          if(h.contains(tar))       
          {
              return true;
          }
        else
        {
            return false;
        }
    }
}    