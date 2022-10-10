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
//Using Iteration
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<Integer>();
        if(root==null){
            return res;
        }
        Stack<TreeNode> s=new Stack<TreeNode>();
        TreeNode curr=root;
        TreeNode prev=null;
        while(curr!=null ||s.isEmpty()==false){
            while(curr!=null){
                s.push(curr);
                curr=curr.left;
            }
            curr=s.peek();
            if(curr.right!=null && curr.right!=prev){
                curr=curr.right;
            }
            else{
                s.pop();
                res.add(curr.val);
                prev=curr;
                curr=null;
            }
        }
        return res;
    }
}
