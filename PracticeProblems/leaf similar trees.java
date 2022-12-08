class Solution {
    ArrayList<Integer> arr1=new ArrayList<>();
    ArrayList<Integer> arr2=new ArrayList<>();
    public void leafSim(TreeNode root,ArrayList<Integer> arr){
        if(root==null){ return;}
        leafSim(root.left,arr);
        if(root.left==null && root.right==null){
        arr.add(root.val);}
        leafSim(root.right,arr);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        leafSim(root1,arr1);
        leafSim(root2,arr2);
        if(arr1.size()!=arr2.size()){
            return false;
        }
        for(int i=0;i<arr1.size();i++){
            if(arr1.get(i)!=arr2.get(i)){
                return false;
            }
        }
        return true;
    }
}
