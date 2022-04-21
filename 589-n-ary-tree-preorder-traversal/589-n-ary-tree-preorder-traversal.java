/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/


// Recursive Solution 
class Solution {
    ArrayList<Integer>l=new ArrayList<Integer>();
    
    public List<Integer> preorder(Node node) {
        if(node==null)
        {
            return new ArrayList<>();
        }
         if(node==null)
        {
            return l;
        }
        
        l.add(node.val);
        for(Node k:node.children)
        {                       
            preorder(k);
        }         
         return l;
    }
}