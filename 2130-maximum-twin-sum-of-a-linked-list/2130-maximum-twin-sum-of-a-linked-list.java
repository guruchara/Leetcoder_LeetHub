/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution 
{    
    public int pairSum(ListNode head) 
    {
        ListNode simple=head;
        
        Stack<ListNode>st=new Stack<>();
        
        while(simple!=null)
        {
            st.push(simple);
            simple=simple.next;
        }
        
        simple=head;
        
        int max=Integer.MIN_VALUE;
        
        int sz=st.size();
        
        while(st.size()>sz/2)
        {
            
            int v2=st.pop().val;
            int v1=simple.val;
            max=Math.max(max,(v1+v2));
            simple=simple.next;
        }
        return max;
    }
}
