public static Node insert(Node root,int k){
    if(root==null){
        Node temp=new Node(k);   //this insert function is used to construct the bst using preorder array
        return temp;
    }
    else if(k<root.data){
        root.left=insert(root.left,k);
    }
    else{
        root.right=insert(root.right,k);
    }
    return root;
}

public static Node post_order(int pre[], int size) 
{
    //Your code here
    Node root=new Node(pre[0]);
    for(int i=1;i<size;i++){
        insert(root,pre[i]);
    }
  return root;
} 
