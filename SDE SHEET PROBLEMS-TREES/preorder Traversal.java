//Using RECURSION
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
//Using Iterative
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<Integer>();
        if(root==null){
            return res;
        }
        Stack<TreeNode> s=new Stack<TreeNode>();
        TreeNode curr=root;
        TreeNode prev=null;
        while(curr!=null ||s.isEmpty()==false){
            while(curr!=null){
                res.add(curr.val);
                s.push(curr);
                curr=curr.left;
            }
            curr=s.peek();
            if(curr.right!=null &&curr.right!=prev){
                curr=curr.right;
            }
            else{
                s.pop();
                prev=curr;
                curr=null;
            }
        }
        return res;
    }
}
