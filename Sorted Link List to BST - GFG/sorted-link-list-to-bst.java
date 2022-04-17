// { Driver Code Starts
import java.util.*;

class LNode
{
    int data;
    LNode next;
    LNode(int d) {
        data = d; 
        next = null;
    }
}

class TNode
{
    int data;
    TNode left, right;
    TNode(int x)
    {
        data=x;
        left=right=null;
    }
    
}


class ListToBST
{
    
  /* Function to print linked list */
   public static void preOrder(TNode root)
    {
        
        if(root==null)
            return;
            
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
	
	 
 
     /* Driver program to test above functions */
    public static void main(String args[])
    {
       
         
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t>0)
         {
			int n = sc.nextInt();
			LNode head = new LNode(sc.nextInt());
            LNode tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new LNode(sc.nextInt());
                tail = tail.next;
            }
		
			Solution obj = new Solution();
			TNode root = obj.sortedListToBST(head);
			preOrder(root);
			
			System.out.println();
			
			t--;
			
         }
    }
}
// } Driver Code Ends


//User function Template for Java

/*Linked List Node
class LNode
{
    int data;
    LNode next;
    LNode(int d) {
        data = d; 
        next = null;
    }
}

//Tree Node
class TNode
{
    int data;
    TNode left, right;
    TNode(int x)
    {
        data=x;
        left=right=null;
    }
    
}*/

// class Solution
// {
//     public int getsize(LNode head)
//     {
//         LNode curr=head;
//         int c=0;
//         while(curr!=null)
//         {
//             c++;
//             curr=curr.next;
//         }
//         return c;
//     }
//     public LNode getmid(LNode head,int idx)
//     {

//       int Size =getsize(head);
       
//       if(Size==0){
//             return head;
//         }
//         else if(idx<0 || idx>=Size){
//             return null;
//         }
//         else{
//             LNode temp=head;
//         for(int i=0;i<idx;i++){
//             temp=temp.next;
//         }
//             return temp;
//         }
//     }
    
   
//     public TNode sortedListToBST(LNode head)
//     {
//          if(head == null || head.next == null)
//           return head != null ? new TNode(head.data) : null;
           
//         int size=getsize(head);
//         LNode midnode=getmid(head,(size)/2);
//         // LNode begin=head;
//         LNode newhead=midnode.next;
        
         
//         TNode node=new TNode(midnode.data);
//         node.left=sortedListToBST(head);
//         node.right=sortedListToBST(newhead);
        
//         return node;
//     }
// }
class Solution
{
public LNode getMiddleOfLL(LNode head) {
       if(head == null || head.next == null)
           return head;
       
       LNode slow = head, fast = head, prev = slow;
       while(fast != null && fast.next != null) {
           prev = slow;
           slow = slow.next;
           fast = fast.next.next;
       }
       prev.next = null;
       return slow;
   }

   public TNode sortedListToBST(LNode head) {
       if(head == null || head.next == null)
           return head != null ? new TNode(head.data) : null;

       LNode midNode = getMiddleOfLL(head);
       LNode nhead = midNode.next;
       TNode root = new TNode(midNode.data);

       root.left = sortedListToBST(head);
       root.right = sortedListToBST(nhead);
       return root;
   }
}