class Solution {
    
    public class Edge
    {
        int src;
        int nbr;
        
        Edge(int src,int nbr)
        {
            this.src=src;
            this.nbr=nbr;
        }        
    }
    public boolean haspath(ArrayList<Edge>graph[],int src,int dest,boolean visited[])
    {
        if(src==dest)
        {
            return  true;
        }
        
        visited[src]=true;
        
       for(int i = 0; i<graph[src].size(); i++){
            Edge edge = graph[src].get(i);
           
           
            if(visited[edge.nbr]==false)
            {
                boolean ans=haspath(graph,edge.nbr,dest,visited);                
                if(ans==true)
                {
                    return true;
                }
            }            
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        ArrayList<Edge>graph[]=new ArrayList[n];
        
        for(int i=0;i<n;i++)
        {
            graph[i]=new ArrayList<>();
        }
        
        for(int i=0;i<edges.length;i++)
        {
            int v1=edges[i][0];
            int v2=edges[i][1];
            
            graph[v1].add(new Edge(v1,v2));
            graph[v2].add(new Edge(v2,v1));
        }
        
        boolean visited[]=new boolean[n];
        
        boolean flag=haspath(graph,source,destination,visited);
        
        return flag;
        
    }
}


