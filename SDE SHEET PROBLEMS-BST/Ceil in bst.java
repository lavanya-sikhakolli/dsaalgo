//finding the closest greater or equal element 
//SOLUTION 1 ...ITERATIVE
class Tree {
    // Function to return the ceil of given number in BST.
    int findCeil(Node root, int key) {
        int res=0;
        while(root!=null){
            if(root.data==key){
                return root.data;
            }
            else if(root.data<key){
                root=root.right;
            }
            else{
                res=root.data;
                root=root.left;
            }
        }
        return res;
    }
}
