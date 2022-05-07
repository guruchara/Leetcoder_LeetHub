class Solution {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        
        // BASE CASE
        if(root==null){
            return root;
        }
        
        if(d==1){
            TreeNode dummyRoot = new TreeNode(v);
            dummyRoot.left = root;
            dummyRoot.right = null;
            return dummyRoot;
        }
        
        // FOR DEPTH
        int depth = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            
            if(depth>=d){ return root; }
            int size = q.size();
            
            if(depth==d-1){
                for(int i=0;i<size;++i){
                    TreeNode node = q.poll();
                    TreeNode dummyRootL = new TreeNode(v,node.left,null);
                    TreeNode dummyRootR = new TreeNode(v,null,node.right);
                    
                    node.left = dummyRootL;
                    node.right = dummyRootR;
                }
                return root;   
            }
            else{
                for(int i=0;i<size;++i){
                    TreeNode node = q.poll();
                    if(node.left!=null){
                        q.add(node.left);
                    }
                    if(node.right!=null){
                        q.add(node.right);
                    }
                }
                ++depth;
            }

        }
        return root;    
    }
    
}