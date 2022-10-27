class Solution {
    //SIMILAR TO LEVEL ORDER TRAVERSAL
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfs(int s,boolean visited[],ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> res,int V){
        visited[s]=true;
        Queue<Integer> q=new LinkedList<>();
        q.add(s);
        while(q.isEmpty()==false){
            int u=q.poll();
            res.add(u);
            for(int v:adj.get(u)){
                if(visited[v]==false){
                    visited[v]=true;
                    q.add(v);
                }
            }
        }
        return res;
        
    }
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> res=new ArrayList<Integer>();
        boolean visited[]=new boolean[V+1];
        //By considering the source node as 0th node
    if(visited[0]==false){
        bfs(0,visited,adj,res,V);}
        
        return res;
    }
}
