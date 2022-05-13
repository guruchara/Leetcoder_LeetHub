/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
         if(root==null) return root;
    
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    
    while(!q.isEmpty()) {
        int size = q.size(), i=0;
        List<Node> list = new ArrayList<>();
        
        while(i < size) {
            Node node = q.remove();
            list.add(node);
            if(i>0){
                Node prev = list.get(i-1);
                prev.next = node;
            }
            if(node.left!=null)
                q.add(node.left);
            if(node.right!=null)
                q.add(node.right);
            i++;
        }
    }
    return root;
}
}