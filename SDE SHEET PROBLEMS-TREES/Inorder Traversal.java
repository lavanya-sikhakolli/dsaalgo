//Using recursion
// LEFT ROOT RIGHT
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


//Inorder Using iterative approach....called as Morris Inorder Traversal
class Solution {
   
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null){
            return res;
        }
       Stack<TreeNode> s=new Stack<TreeNode>();
        TreeNode curr=root;
        while(curr!=null || s.isEmpty()==false){
            while(curr!=null){
                s.push(curr);
                curr=curr.left;
            }
            curr=s.peek();
            s.pop();
            res.add(curr.val);
            curr=curr.right;
        }
        return res;
    }
}
