class Solution {
  //by using binary search algorithm
  //we are finding the mid which is root ...since the array is sorted...so that we will construct height balanced binary tree.
    public TreeNode cT(int []nums,int low,int high){
        if(low>high){ return null;}
        int mid=(low+high)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=cT(nums,low,mid-1);
        root.right=cT(nums,mid+1,high);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;
      return cT(nums,0,n-1);
        
    }
}
