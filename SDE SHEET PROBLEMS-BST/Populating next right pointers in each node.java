class Solution {
    public Node connect(Node root) {
        if(root==null){
            return null;
        }
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        while(q.isEmpty()==false){
            int count=q.size();
            for(int i=0;i<count;i++){
            Node curr=q.poll();
           if(i==count-1){
               curr.next=null;
           }
         else{
                curr.next=q.peek();
                }
              if(curr.left!=null){ q.add(curr.left);}
                if(curr.right!=null){ q.add(curr.right);}
            }
        }
        return root;
    }
}
