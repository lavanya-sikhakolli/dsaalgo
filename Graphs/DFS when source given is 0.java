class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public void DFS(int V,ArrayList<ArrayList<Integer>> adj,int s,ArrayList<Integer> res,boolean visited[]){
        visited[s]=true;
        res.add(s);
        for(int u:adj.get(s)){
            if(visited[u]==false){
                DFS(V,adj,u,res,visited);
            }
        }
    }
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> res=new ArrayList<>();
        boolean visited[]=new boolean[V+1];
        if(visited[0]==false){
            DFS(V,adj,0,res,visited);
        }
        return res;
    }
}
