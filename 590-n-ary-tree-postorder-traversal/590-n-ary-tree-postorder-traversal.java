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

class Solution {
    ArrayList<Integer>l=new ArrayList<Integer>();
    public List<Integer> postorder(Node node) {
                
        if(node==null)
        {
            return l;
        }
        
        for(Node k:node.children)
        {           
           postorder(k);         
        }
         l.add(node.val);
         return l;
    }
}