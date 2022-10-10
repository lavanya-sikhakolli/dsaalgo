//Using RECURSION
class Solution {
    public void postOrder(TreeNode root,List<Integer> res){
        if(root!=null){
            postOrder(root.left,res);
            postOrder(root.right,res);
            res.add(root.val);
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        postOrder(root,res);
        return res;
    }
}
