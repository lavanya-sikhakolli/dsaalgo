class Solution {
    TreeNode  prev=null;
    public boolean isValidBST(TreeNode root) {
        //we are checking the whether the inorder traversal is sorted or not
        if(root==null){ return true;}
        
        if(isValidBST(root.left)==false){
            return false;
        }
        //whenever we got to know that pair is not sorted we are returning false
        if(prev!=null &&root.val<=prev.val){
            return false;
        }
        prev=root;
        return isValidBST(root.right);
    }
}
