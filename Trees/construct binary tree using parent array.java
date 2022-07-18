//Function to construct binary tree from parent array.
    public static Node createTree(int parent[], int N)
    {
        //Your code here
        Node arr[]=new Node[N];
        Node root=null;
        for(int i=0;i<N;i++){
            arr[i]=new Node(i);
        }
        for(int i=0;i<N;i++){
            if(parent[i]==-1) {root=arr[i];}
            else{
                int index=parent[i];
                if(arr[index].left==null){
                    arr[index].left=arr[i];
                }
                else{ 
                   arr[index].right=arr[i]; 
            }
        }
    }
    
    return root;
    }
}
