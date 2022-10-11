class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        while(q.isEmpty()==false){
            int count=q.size();
            List<Integer> res1=new ArrayList<>();
            for(int i=0;i<count;i++){
            TreeNode curr=q.poll();
                res1.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            res.add(res1);
        }
        return res;
    }
}
//Zig-Zag traversal
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> q=new LinkedList<>();
        Stack<Integer> s=new Stack<>();
        boolean flag=false;
        q.add(root);
        while(q.isEmpty()==false){
            int count=q.size();
            List<Integer> res1=new ArrayList<>();
            for(int i=0;i<count;i++){
                TreeNode curr=q.poll();
            if(flag==true){
               s.push(curr.val);
            }
         else{
                res1.add(curr.val);}
                 if(curr.left!=null){ q.add(curr.left);}
                 if(curr.right!=null){ q.add(curr.right);}
                
            }
                //res.add(res1);
            
            if(flag==true){
                while(s.isEmpty()==false){
                res1.add(s.pop());}
            }
                flag=!flag;
            res.add(res1);
         
        }
        return res;
    }
}
