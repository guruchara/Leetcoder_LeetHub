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

// class Solution {

// public ArrayList<Node> nodetopath(Node node, int x)
// {
//     if(node==null)
//     {
//         return new ArrayList<>();
//     }

//     if(node.data==x)
//     {
//         ArrayList<Node>base=new ArrayList<>();
//         base.add(node);
//     }

//     ArrayList<Node>lans=nodetopath(node.left,x);

//     if(lans.size()>0)
//     {
//         lans.add(node);
//         return lans;
//     }

//     ArrayList<Node>rans=nodetopath(node.right,x);
//     if(rans.size()>0)
//     {
//         rans.add(node);
//         return rans;
//     }

//     return new ArrayList<>();
// }

// public int minDiffInBST(TreeNode node) {

// }
// }


class Solution {
    
    ArrayList<TreeNode>l=new ArrayList<>();
    
    public void inorder(TreeNode node)
    {
        if(node==null)
        {
            return;
        }
        
        inorder(node.left);
        l.add(node);
        inorder(node.right);
    }
    public int minDiffInBST(TreeNode node) 
    {
        
        inorder(node);
        
        int min=Integer.MAX_VALUE;
                
        for(int i=1;i<l.size();i++)
        {
           min=Math.min(min,l.get(i).val-l.get(i-1).val);
        }
        return min;
    }
}