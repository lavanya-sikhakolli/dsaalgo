class GfG
{
    Node merge(Node a,Node b){
        Node temp=new Node(0);
        Node res=temp;
        while(a!=null && b!=null){
            if(a.data<=b.data){
               temp.bottom=a;
               temp=a;
               a=a.bottom;
            }
            else{
                temp.bottom=b;
                temp=b;
                b=b.bottom;
            }
            if(a!=null){temp.bottom=a;}
            else{ temp.bottom=b;}
        }
            return res.bottom;
        
    }
    Node flatten(Node root)
    {
	// Your code here
	if(root==null||root.next==null){
	    return root;
	}
	root.next=flatten(root.next);
	root=merge(root,root.next);
	return root;
    }
}
