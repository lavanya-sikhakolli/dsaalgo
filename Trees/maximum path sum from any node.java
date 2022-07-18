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
// here why we are creating result class ...because ...we can update res value in every call...to make it possible...we are doing that.!!!
//if any of the sum is negative.....we are not considering that subtree value......thats why we are returning zero.!!!!
