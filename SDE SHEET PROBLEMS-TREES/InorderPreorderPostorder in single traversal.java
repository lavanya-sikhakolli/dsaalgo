public class Solution {
    public static void traversal(List<Integer> pre,List<Integer> in,List<Integer> post,BinaryTreeNode<Integer> root){
        if(root!=null){
            pre.add(root.data);
            traversal(pre,in,post,root.left);
            in.add(root.data);
            traversal(pre,in,post,root.right);
            post.add(root.data);
        }
        
    }
    public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
        // Write your code here.
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        List<Integer> pre=new LinkedList<>();
        List<Integer> in=new LinkedList<>();
        List<Integer> post=new LinkedList<>();
      traversal(pre,in,post,root);
        res.add(in);
        res.add(pre);
        res.add(post);
        return res;
    }
}
