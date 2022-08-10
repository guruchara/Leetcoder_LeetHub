class Solution {
    // array already in sorted order
    public TreeNode CREATEBST(int a[],int i,int j)
    {
        if(i>j)
        {
            return null;
        }
        int mid=(i+j)/2;
        
        TreeNode newNode=new TreeNode(a[mid]);
        // we alredy known in BST left side all elements are smaller 
        newNode.left=CREATEBST(a,i,mid-1);
        // in right side larger value
        newNode.right=CREATEBST(a,mid+1,j);
        
        return newNode;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
         if(nums.length==0)
         {
             return null;
         }
        return CREATEBST(nums,0,nums.length-1);        
    }
}