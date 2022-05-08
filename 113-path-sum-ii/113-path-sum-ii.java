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
    
    public List<List<Integer>> ans=new ArrayList<>();
    public void solve(TreeNode root , int target ,int sum, List<Integer> temp){
        
        if(root == null)
            return ;
        
        if(root.left == null && root.right == null){
            sum += root.val;
            
            if(sum == target){
                temp.add(root.val);                
                ans.add(new ArrayList<>(temp));                
                temp.remove(temp.size()-1);
                return;
            }
        }
        
        if(root.left!=null){
            temp.add(root.val);            
            solve(root.left , target, sum + root.val , temp);
            temp.remove(temp.size()-1);
            
        }
        if(root.right!=null){
            temp.add(root.val);
            
            solve(root.right , target, sum + root.val , temp);
            temp.remove(temp.size()-1);
            
        }
        
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
                
        int sum = 0;
        solve(root,targetSum,sum,new ArrayList<>());
        return ans;
    }
}
