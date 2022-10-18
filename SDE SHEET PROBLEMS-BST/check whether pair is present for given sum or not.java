//finding the inorder traversal(sorted) and storing it in an arrayList 
//finding the pair by using the two pointer approach
class Solution {
    public boolean findTarget(TreeNode root, int k) {
     ArrayList<Integer> nums=new ArrayList<>();
        inorder(root,nums);
        int n=nums.size();
        int i=0,j=n-1;
        while(i<j){
        int sum=nums.get(i)+nums.get(j);
            if(sum<k){
                i++;
            }
            else if(sum>k){
                j--;
            }
            else{
                return true;
            }
            }
        return false;
    }
    public void inorder(TreeNode root,ArrayList<Integer> nums){
        if(root==null){ return;}
        inorder(root.left,nums);
        nums.add(root.val);
        inorder(root.right,nums);
    }
}
