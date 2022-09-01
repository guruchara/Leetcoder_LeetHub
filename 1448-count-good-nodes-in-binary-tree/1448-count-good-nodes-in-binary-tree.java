class Solution {
    int max=Integer.MIN_VALUE;
    public int c=0;
    
    public void dfs(TreeNode node,int max)
    {
        if(node==null)
        {
            return;
        }
        
        if(node.val>=max)
        {
            c++;            
        }
        dfs(node.left,Math.max(node.val,max));
        
        dfs(node.right,Math.max(node.val,max));
    }
    
    public int goodNodes(TreeNode node) {
        dfs(node,max);
        return c;
    }
}