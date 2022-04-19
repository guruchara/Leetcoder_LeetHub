// { Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            Solution g = new Solution();
            int ans = g.getMiddle(head);
            System.out.println(ans);
            //printList(head); 
            t--;
        }
    } 
} 
   // } Driver Code Ends


/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution
{
    int s(Node head)
    {
        if(head==null)
        {
            return 0;
        }
        Node curr=head;
        int c=0;
        while(curr!=null)
        {
            c++;
            curr=curr.next;
        }
        return c;
    }
    int midnode(Node node,int size)
    {
        Node curr=node;
        int i=0;
       while(curr.next!=null && i<size)
       {
           curr=curr.next;
           i++;
       }
        return curr.data;
    }
    int getMiddle(Node head)
    {
         int size=s(head);
         int mid=midnode(head,size/2);
         return mid;
    }
}
