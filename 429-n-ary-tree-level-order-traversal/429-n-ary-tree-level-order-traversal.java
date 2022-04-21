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

class Solution 
{
    public List<List<Integer>> levelOrder(Node node) {
         
        if(node==null)
        {
            return new ArrayList<>();
        }
        List<List<Integer>>l=new ArrayList<>();                        
        Queue<Node>q=new ArrayDeque<>();        
        q.add(node);
        
        while(q.size()!=0)
        {
            int c=q.size();
        
             List<Integer>ls=new ArrayList<>();
            
            for(int i=0;i<c;i++)
            {
                node=q.remove();
                ls.add(node.val);
                
              for (Node v : node.children)
               {
                    q.add(v);
               }
            }
            l.add(ls);   
        }        
        return l;
    }
}
  