// { Driver Code Starts
//Initial Template for Java



//Initial Template for Java

//Contributed by Sudarshan Sharma
import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}


class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    void inOrder(Node node) {
        if (node == null) {
            return;
        }
 
        inOrder(node.left);
        System.out.print(node.data + " ");
 
        inOrder(node.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t-- > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
                Spiral g = new Spiral();
                ArrayList<Integer> result = g.findSpiral(root);
                for(int value : result)
                System.out.print(value + " ");
			    System.out.println();
    	        
	        }
	}
}



// } Driver Code Ends


//User function Template for Java


/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node node) 
    {
        if(node==null)
        {
            return new ArrayList<>();
        }
        Queue<Node>q=new ArrayDeque<>();
        q.add(node);
        ArrayList<Integer>lm=new ArrayList<>();
        int lvl=0;
        while(q.size()>0)
        {
            int k=q.size();
            
            ArrayList<Integer>l=new ArrayList<>();
            for(int i=0;i<k;i++)
            {
                node=q.remove();
                l.add(node.data);
                
                if(node.left!=null)
                {
                    q.add(node.left);
                }
                
                if(node.right!=null)
                {
                    q.add(node.right);
                }
            }
            
           
            if(lvl%2!=0)
            {
                for(int val:l)
                {
                    lm.add(val);
                }
            }
            else
            {
                for(int i=l.size()-1;i>=0;i--)
                {
                    lm.add(l.get(i));
                }
            }
            ++lvl;
        }
        return lm;
    }
}