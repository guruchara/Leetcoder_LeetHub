class Solution {
    public ListNode midNode(ListNode head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        //previous node
        ListNode prev=null;
        // current node
        ListNode curr=head;
        //forward node or say next node
        
        // here check is curr null
        while(curr!=null)
        {
           ListNode forw=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forw;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        
        if(head==null || head.next==null)
        {
            return true;
        }
        
        ListNode mid=midNode(head); // mid of ll
        ListNode newhead=mid.next;
        mid.next=null;
        // similar as mid+1
        newhead=reverse(newhead);
        
        ListNode c1=head;
        ListNode c2=newhead;
        
        boolean flag=true;
        
        while(c1!=null && c2!=null)
        {
            if(c1.val!=c2.val)
            {                
                return false;
            }
            c1=c1.next;
            c2=c2.next;
        }
        newhead=reverse(newhead);
        mid.next=newhead;
      return true;    
    }
}