class BST {
    // Function to search a node in BST.
    boolean search(Node root, int x) {
        // Your code here
        if(root==null){
            return false;
        }
       else if(root.data==x){
            return true;
        }
        else if(root.data<x){
          return search(root.right,x);
        }
        else {
          return search(root.left,x);
        }
    
    }
}
