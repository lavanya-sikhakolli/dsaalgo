class Solution {
    public void preOrder(TreeNode root,List<Integer> res){
        if(root!=null){
            res.add(root.val);
            preOrder(root.left,res);
            preOrder(root.right,res);
        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root ==null){
            return res;
        }
        preOrder(root,res);
        return res;
    }
}
