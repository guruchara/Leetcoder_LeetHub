// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the current node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the current node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the current node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException
    {
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine().trim();
            Node root = buildTree(s);
            Solution T = new Solution();
            int target = Integer.parseInt(br.readLine().trim());
            int k = Integer.parseInt(br.readLine().trim());
            ArrayList<Integer> res = new ArrayList<Integer>();
            res = T.KDistanceNodes(root,target,k);
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();    
            t--;
        }
    }
}
// } Driver Code Ends


//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right;
// }

class Solution
{
    // public static ArrayList<Integer>p=new ArrayList<>();
    public static ArrayList<Node> nodetorootpath(Node node, int x)
    {
        if(node==null)
        {
            return new ArrayList<>();
        }
        
        if(node.data==x)
        {
            ArrayList<Node>base=new ArrayList<Node>();
            base.add(node);
            return base;
        }
        
        ArrayList<Node>lans=nodetorootpath(node.left,x);
        if(lans.size()>0)
        {
            lans.add(node);
            return lans;
        }
        
        ArrayList<Node>rans=nodetorootpath(node.right,x);
        if(rans.size()>0)
        {
            rans.add(node);
            return rans;
        }
        
        return  new ArrayList<>();
    }
    
    public static void printKLevelsDown(Node node, int k, Node blocker,ArrayList<Integer>p){
        if(node == null || k < 0 || node == blocker){
            return;
        }
        if(k == 0){
            p.add(node.data);
        }
        printKLevelsDown(node.left, k-1, blocker,p);
        printKLevelsDown(node.right, k-1, blocker,p);
   }
   
    public static ArrayList<Integer> KDistanceNodes(Node node, int tar, int k)
    {
        ArrayList<Integer>p=new ArrayList<>();
        ArrayList<Node>n2R=nodetorootpath(node,tar);
        
       Node blocker = null;
    
      for(int i = 0; i<n2R.size(); i++){
        Node n = n2R.get(i);
        printKLevelsDown(n, k-i, blocker,p);
        blocker = n;
    }
      Collections.sort(p);
       return p;   
    }
};