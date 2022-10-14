class Solution {
    public static ListNode middle(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head.next;
        
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.next;
    }
    public ListNode deleteMiddle(ListNode head) {
        
        if(head==null || head.next==null)
        {
            return null;
        }
        ListNode curr=head;
        ListNode mid=middle(head);
        while(curr!=null)
        {
            if(curr.next==mid)
            {
                curr.next=mid.next;
                break;
            }
            curr=curr.next;
        }
        return head;
    }
}