/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        
        LinkedHashSet<ListNode>h=new LinkedHashSet<ListNode>();
        
        while(head1!=null)
        {
            h.add(head1);
            head1=head1.next;
        }
        
        while(head2!=null)
        {
            if(h.contains(head2))
            {
               return head2;
            }
            head2=head2.next;
        }
        return null;
    }
}