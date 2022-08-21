class Solution {
    public Node cloneGraph(Node node) {
        
        if(node == null) return null;
        Map<Integer , Node>  map = new HashMap<>(); 
        dfs(node , map);
     return map.get(node.val);   
    }
    
    public void dfs(Node node , Map<Integer , Node> map) {
        
        Node newNode = new Node(node.val);
        map.put(node.val , newNode);
        
        for(Node curr : node.neighbors) {
            if(map.containsKey(curr.val) == false)
                dfs(curr , map);
                
            newNode.neighbors.add(map.get(curr.val));
        }
    }
}
