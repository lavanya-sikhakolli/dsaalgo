//Using recursion
class Solution {
    public void inOrder(TreeNode root,List<Integer> res){
        if(root!=null){
            inOrder(root.left,res);
            res.add(root.val);
            inOrder(root.right,res);
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root ==null){
            return res;
        }
       inOrder(root,res); 
        return res;
    }
}
