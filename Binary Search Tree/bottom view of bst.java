class Pair{
        Node node;
        int hd;
        Pair(Node n,int h){ node=n; hd=h;}
        
    }
class Solution
{
    
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
    Queue<Pair> q=new LinkedList<>();
    TreeMap<Integer,Integer> mp=new TreeMap<>();
    ArrayList<Integer> res=new ArrayList<>();
    if(root==null){ return res;}
    q.add(new Pair(root,0));
    while(q.isEmpty()==false){
        Pair p=q.poll();
        Node curr=p.node;
        int hd=p.hd;
        if(mp.containsKey(hd)){
            mp.put(hd,curr.data);
        }
        else{
            mp.put(hd,curr.data);
        }
        if(curr.left!=null){ q.add(new Pair(curr.left,hd-1));}
        if(curr.right!=null){ q.add(new Pair(curr.right,hd+1));}
    }
    for(Map.Entry<Integer,Integer> p: mp.entrySet()){
        res.add(p.getValue());
    }
      return res;  
    }
}
