//returning the closest smallest or equal value for the given key
//Iterative Solution
 public static int floorInBST(TreeNode<Integer> root, int X) {
        //    Write your code here.
       int res=0;
        while(root!=null){
            if(root.data==X){
                return root.data;
            }
            else if(root.data>X){
                root=root.left;
            }
          //if the root of data is smaller than given X,then there might be the chances that to be the result...for that we are storing it
            else{
                res=root.data;
                root=root.right;
            }
        }
        return res;
    }
}
