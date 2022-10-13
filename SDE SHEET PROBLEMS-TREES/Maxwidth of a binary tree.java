//max widthe is defined as the number of elements present in the level including the end elements(rightmost-leftmost+1)
//for that we are storing the elements with the particular values...to get the count 


class Pair{
    TreeNode node;
    int num;
    Pair(TreeNode no,int n){
        node=no;
        num=n;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int res=Integer.MIN_VALUE,flag=0;
        int left=0,right=0;
        Queue<Pair> q=new LinkedList<Pair>();
        q.add(new Pair(root,1));
        while(q.isEmpty()==false){
            int count=q.size();
            for(int i=0;i<count;i++){
                Pair qout=q.poll();
                TreeNode curr=qout.node;
                int curr_val=qout.num;
                if(i==0){
                    left=curr_val;
                }
                if(i==count-1){
                    right=curr_val;
                }
                //if the root is n,then left node position is 2*n
                if(curr.left!=null){
                    q.add(new Pair(curr.left,curr_val*2)); 
                }
                //if the root is n,then right node position is 2*n+1;
                if(curr.right!=null){
                    q.add(new Pair(curr.right,(curr_val*2)+1));
                  }
            }
                flag=right-left+1;
                res=Math.max(flag,res);
        }
        return res;
    }
}
