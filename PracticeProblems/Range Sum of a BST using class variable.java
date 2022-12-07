class Solution {
   class Sum{
       int res=0;
   }
    public void range(TreeNode root,int low,int high,Sum sum){
        if(root==null){ return;}
            if(root.val>=low && root.val<=high  ){
                sum.res+=root.val;
            }
        range(root.left,low,high,sum);
        range(root.right,low,high,sum);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        Sum s=new Sum();
        range(root,low,high,s);
        return s.res;
    }
}

//other solution
class Solution {
 
    public int rangeSumBST(TreeNode root, int low, int high) {
      if(root==null){ return 0;}
      if(root.val<low){ return rangeSumBST(root.right,low,high); }
      else if(root.val>high){ return rangeSumBST(root.left,low,high);}
      return root.val+rangeSumBST(root.left,low,high)+rangeSumBST(root.right,low,high);
    }
}
