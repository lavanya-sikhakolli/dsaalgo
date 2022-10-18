public class Codec {
   
    
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null){ return "#";}
       return root.val+","+serialize(root.left)+","+serialize(root.right);
       
    }

    // Decodes your encoded data to tree.
    public TreeNode helper(Queue<String> q){
        String s=q.poll();
        if(s.equals("#")){ return null;}
        //converting string in to integer and adding the data in to the node
        TreeNode root=new TreeNode(Integer.valueOf(s));
        root.left=helper(q);
        root.right=helper(q);
        return root;
    }
    
    public TreeNode deserialize(String data) {
        //converting the string in to a list of strings by using split method
        Queue<String> q=new LinkedList<>(Arrays.asList(data.split(",")));
        return helper(q);
    }
}
