// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
    
//     public HashSet<Integer>h2=new LinkedHashSet<>();
    
//     public void inorder(TreeNode node)
//     {
//         if(node==null)
//         {
//             return;
//         }
        
//         inorder(node.left);
//         h2.add(node.val);
//         inorder(node.right);        
//     }
    
//     public boolean isSubPath(ListNode head, TreeNode node) {
//         if(node==null || head==null)
//         {
//             return false;
//         }
        
//         HashSet<Integer>h1=new LinkedHashSet<>();
//         ListNode curr=head;
        
//         while(curr!=null)
//         {
//             h1.add(curr.val);
//             curr=curr.next;
//         }
        
//         inorder(node);
        
//         if(h1.size()>h2.size())
//         {
//             return false;
//         }
        
//         int c=0;
//         for(int val:h2)
//         {
//             if(h1.contains(val))
//             {
//                 c++;
//             }
//         }
//         return c>=h1.size()?true:false;
//     }
// }

class Solution {
    
    public boolean dfs(ListNode h, TreeNode node) {
        if(h == null)
            return true;
        
        if(node == null) 
            return false;
        
        if(node.val == h.val) 
            
            return dfs(h.next, node.left) || dfs(h.next, node.right);
        
        return false;
    }
    
    public boolean isSubPath(ListNode head, TreeNode root) {
        
        if(root == null) 
            return false;
        
        if(dfs(head, root)) 
            return true;
        
        return isSubPath(head, root.left) || isSubPath(head, root.right);
    }        
}