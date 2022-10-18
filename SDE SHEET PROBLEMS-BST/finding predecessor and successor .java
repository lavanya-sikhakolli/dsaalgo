class GfG
{
   //similar to floor function
    public static Node predecessor(Node root,int key){
        Node pre=null;
       while(root!=null){
        if(root.data>=key){
            root=root.left;;
        }
        else{
            pre=root;
           root=root.right;
        }
       }
        return pre;
    }
  //similar to ceil function
    public static Node successor(Node root,int key){
        Node succ=null;
        while(root!=null){
        if(root.data<=key){
            root=root.right;
        }
        else{
            succ=root;
            root=root.left;
        }
        }
        return succ;
    }
    public static void findPreSuc(Node root, Res p, Res s, int key)
    {
       // add your code here
       p.pre=predecessor(root,key);
       s.succ=successor(root,key);
    }
}
