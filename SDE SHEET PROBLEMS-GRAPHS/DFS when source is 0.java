class Solution {
    //DFS IS RECURSIVE IN NATURE
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(int s,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> res,boolean visited[],int V){
        visited[s]=true;
        res.add(s);
        for(int v:adj.get(s)){
            if(visited[v]==false){
                dfs(v,adj,res,visited,V);
            }
        }
        return res;
    }
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> res=new ArrayList<Integer>();
        boolean visited[]=new boolean[V+1];
        if(visited[0]==false){
            dfs(0,adj,res,visited,V);
        }
        return res;
    }
}
