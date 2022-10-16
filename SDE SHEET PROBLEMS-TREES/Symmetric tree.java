class Solution {
    public boolean isSymmetry(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null){  return false;}
        if(root1.val==root2.val){
            return (isSymmetry(root1.left,root2.right) &&(isSymmetry(root1.right,root2.left)));
        }
        return false;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root.left==null && root.right==null){
            return true;
        }
        if(root.left==null || root.right==null){
            return false;
        }
        boolean res=isSymmetry(root.left,root.right);
        return res;
    }
}
