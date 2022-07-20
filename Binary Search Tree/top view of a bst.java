class Pair{
    Node node;
    int hd;
    Pair(Node n,int h){ node=n;hd=h;}
}
class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
         Queue<Pair> q=new LinkedList<>();
    TreeMap<Integer,Integer> mp=new TreeMap<>();
    ArrayList<Integer> res=new ArrayList<>();
    if(root==null){ return res;}
    q.add(new Pair(root,0));
    while(q.isEmpty()==false){
        Pair p=q.poll();
        Node curr=p.node;
        int hd=p.hd;
        if(!mp.containsKey(hd)){
          mp.put(hd,curr.data);}
       
        if(curr.left!=null){ q.add(new Pair(curr.left,hd-1));}
        if(curr.right!=null){ q.add(new Pair(curr.right,hd+1));}
    }
    for(Map.Entry<Integer,Integer> p: mp.entrySet()){
        res.add(p.getValue());
        
    }
      return res;  
        
    }
}
