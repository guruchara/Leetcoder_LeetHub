/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        HashSet<ListNode>h=new HashSet<>();
        ListNode curr=head;
        while(curr!=null)
        {
           if(h.contains(curr))
           {
               return true;         
           }              
           else
            {
                h.add(curr);
            }
              curr=curr.next;                      
    }
              return false;
}
              }