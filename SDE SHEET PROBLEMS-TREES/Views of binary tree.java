//LEFT VIEW OF A BINARY TREE
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> res=new ArrayList<>();
      if(root==null){ return res;}
      Queue<Node> q=new LinkedList<Node>();
      q.add(root);
      while(q.isEmpty()==false){
          int count=q.size();
        for(int i=0;i<count;i++){
                Node curr=q.poll();
              if(i==0){
                  res.add(curr.data);
              }
              if(curr.left!=null){ q.add(curr.left);}
              if(curr.right!=null){ q.add(curr.right);}
          }
      }
      return res;    
    }
}
//TOP VIEW OF A BINARY TREE
class Pair{
    Node node;
    int hd;
    Pair(Node n,int h){
        node=n;
        hd=h;
    }
}
class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        ArrayList<Integer> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<Pair> q=new LinkedList<>();
        Map<Integer,Integer> mp=new TreeMap();
        q.add(new Pair(root,0));
        while(q.isEmpty()==false){
            Pair p=q.poll();
            Node curr=p.node;
            int hd=p.hd;
            if(!mp.containsKey(hd)){
                mp.put(hd,curr.data);
            }
            if(curr.left!=null){
                q.add(new Pair(curr.left,hd-1));
            }
            if(curr.right!=null){
                q.add(new Pair(curr.right,hd+1));
            }
        }
        for(Map.Entry<Integer,Integer> p:mp.entrySet()){
            res.add(p.getValue());
        }
        return res;
    }
}
