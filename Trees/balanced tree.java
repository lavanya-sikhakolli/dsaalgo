class Solution {
    
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        if(lh==-1){return -1;}
        int rh=height(root.right);
        if(rh==-1){return -1;}
        if(Math.abs(lh-rh)>1){ return -1;}
        else return Math.max(lh,rh)+1;
    }
    
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int res=height(root);
       if(res==-1){
           return false;
       }
        return true;
    }
}
