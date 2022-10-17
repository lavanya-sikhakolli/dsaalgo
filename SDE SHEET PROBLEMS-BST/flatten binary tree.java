//Solution1 RECURSIVE
//since the preorder traversal is R l r ...we are picking the right most and connecting the next to null and left to null and making the root as prev
class Solution {
    TreeNode prev=null;
    public void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        
      flatten(root.right);
      flatten(root.left);
      root.right=prev; 
        root.left=null;
      prev=root;
        
    }
}

//SOLUTION 2 ITERATIVE
class Solution {
    public void flatten(TreeNode root) {
        if(root==null){ return ;}
      //here we are conisdering stack ...therefore we are pushing right first and then left...so while popping we will get left first which is similar to preorder
      //traversal
        Stack<TreeNode> st=new Stack<TreeNode>();
        st.push(root);
        while(st.isEmpty()==false){
            TreeNode curr=st.pop();
            if(curr.right!=null){
                st.push(curr.right);
            }
            if(curr.left!=null){
                st.push(curr.left);
            }
            if(st.isEmpty()==false){
            curr.right=st.peek();}
            curr.left=null;
        }
    }
}
