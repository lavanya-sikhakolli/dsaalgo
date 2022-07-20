public class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    int prev=Integer.MIN_VALUE;
    boolean isBST(Node root)
    {
        // code here.
        if(root==null){ return true;}
        if(isBST(root.left)==false){
            return false;
        }
        if(root.data<prev){ return false;}
        else
        {
            prev=root.data;
        }
        return isBST(root.right);
    }
}
