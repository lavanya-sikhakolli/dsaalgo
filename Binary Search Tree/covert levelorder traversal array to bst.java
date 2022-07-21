class GFG 
{
    //Function to construct the BST from its given level order traversal.
    public Node insert(Node root,int k){
        if(root==null){
            Node temp=new Node(k);
            return temp;
        }
        if(k<root.data){
            root.left=insert(root.left,k);
        }
        else{
            root.right=insert(root.right,k);
        }
        return root;
    }
    
    public Node constructBST(int[] arr)
    {
        //Write your code here 
        Node root=new Node(arr[0]);
        int n=arr.length;
        for(int i=1;i<n;i++){
            insert(root,arr[i]);
        }
        return root;
        
    }
}
