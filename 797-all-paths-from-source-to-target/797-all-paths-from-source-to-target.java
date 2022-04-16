class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(graph, res, path, 0);
        return res;
    }
    static void dfs(int[][] graph, List<List<Integer>> res, List<Integer> path, int u){
        path.add(u);
        if(u == graph.length-1) res.add(new ArrayList(path));
        else{
            for(int v : graph[u])
                dfs(graph, res, path, v);
        }
        
        path.remove(path.size()-1);
    }
}