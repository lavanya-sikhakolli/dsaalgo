class Solution {
    // Function to return Breadth First Traversal of given graph.
    public void BFS(int V,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> res,boolean visited[],int s){
        Queue<Integer> q=new LinkedList<Integer>();
        visited[s]=true;
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
    }
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> res=new ArrayList<Integer>();
        boolean visited[]=new boolean[V+1];
        if(visited[0]==false){
                BFS(V,adj,res,visited,0);
            }
        
        return res;
        
    }
}
