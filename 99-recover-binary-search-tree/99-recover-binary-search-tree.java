class Solution {
    ArrayList<Integer>l=new ArrayList<>();
    int c=0;
    public void Inorder(TreeNode node)
    {
        if(node==null)
        {
           return;
        }
        Inorder(node.left);
        l.add(node.val);        
        Inorder(node.right);        
    }
    public void Insertval(TreeNode node)
    {
        if(node==null)
        {
            return;
        }
        Insertval(node.left);
        node.val=l.get(c);
        c++;
        Insertval(node.right);
    }
    public void recoverTree(TreeNode node) {
        if(node==null)
        {
            return;
        }                
        Inorder(node);
        Collections.sort(l);
        Insertval(node);
    }
}