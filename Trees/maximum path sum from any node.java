class Solution
{
    //Function to return maximum path sum from any node in a tree.
class Res{
    int maxval=Integer.MIN_VALUE;
}
   int func(Node root,Res res){
       if(root==null){ return 0;}
       int l=func(root.left,res);
      // System.out.print(" maximum value...."+res.maxval+" ");
       int r=func(root.right,res);
       res.maxval=Math.max(res.maxval,Math.max(l+root.data+r,Math.max(l+root.data,r+root.data)));//maxval is the max. path sum which we need to return
     //  System.out.print("maxiimum value is"+res.maxval+"   ");
      if(res.maxval<0){
        return Math.max(Math.max(l,r),root.data);}//if all the values are negative...we are returning max among those
       else{
          if( (Math.max(l,r)+root.data)<0){//here the returning values are l and r values of root
              return 0;}
          else{
              return Math.max(l,r)+root.data;
          }
          
       }
     
   }
   
    int findMaxSum(Node node)
    {
       Res res=new Res();
       func(node,res);
       return res.maxval;
    }
}
// here why we are creating result class ...because ...we have to update res value in every call...to make it possible...we are doing that.!!!
//if any of the sum is negative.....we are not considering that subtree value......thats why we are returning zero.!!!!

//SOLUTION 2
class Solution {
public:
    
    //time  : O(n)
    //space : O(n)
    
    int maxPathSum(TreeNode* root) {
        
        int res = -10001;
        int k = sum(root, res);     //k is of no significance here
        return res;
    }
    
    int sum(TreeNode* root, int &res){
        if(!root) return 0;                     //if we hit null return 0
        
        int lmax = sum(root->left, res);        //lmax stores max val of subtree connected to root in left side
        int rmax = sum(root->right, res);       //Rmax stores max val of subtree connected to root in right side
        
        //if any of both is -ve make them 0 as our objective is to maximize the sum
        if(lmax < 0) lmax = 0;
        if(rmax < 0) rmax = 0;
        
        res = max(res, root->val+lmax+rmax);    //in the process update res for each node
        
        return root->val+max(lmax,rmax);        //return which side gives maximum sum
        //note here return is of no significance for the qn, we apply some method and in between we collect our ans
        //for ex, in diameter qn we find height and collect diameter lly here we apply sum method and 
        //in between we update our required answer to maximum
    }
};

