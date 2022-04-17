// { Driver Code Starts
import java.io.*;
import java.util.*;
class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}
class GfG
{
    static Scanner sc = new Scanner(System.in);
    public static Node inputList(int size)
    {
        Node head, tail;
        int val;
        
        val = sc.nextInt();
        
        head = tail = new Node(val);
        
        size--;
        
        while(size-->0)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return head;
    }
    
    public static void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public static void main(String args[])
        {
            
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n , m;
                    
                    n = sc.nextInt();
                    m = sc.nextInt();
                    
                    Node head1 = inputList(n);
                    Node head2 = inputList(m);
                    
                    Sol obj = new Sol();
                    
                    Node result = obj.findIntersection(head1, head2);
	    
	                printList(result);
	                System.out.println();
                }
        }
}// } Driver Code Ends


/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
        Node x=new Node(-1);
        
        Node curr=x;
        Node temp1=head1;
        Node temp2=head2;
        
        LinkedHashSet<Integer>h=new LinkedHashSet<Integer>();
        
        while(temp2!=null)
        {
            h.add(temp2.data);
            temp2=temp2.next;
        }
        
        while(temp1!=null)
        {
            if(h.contains(temp1.data))
            {
                Node simple=new Node(temp1.data);
                x.next=simple;
                x=x.next;
            }
             temp1=temp1.next;
        }
        // from here we return x.next because  in 0th node we have -1 so we will return x.next
        return curr.next;
    }
}