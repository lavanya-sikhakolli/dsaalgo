//SOLUTION1
class Solution {
    //similar to finding path for a given node from root and storing the paths in arr
    public boolean findingPath(TreeNode root,TreeNode num,ArrayList<TreeNode> arr){
        if(root==null){
            return false;
        }
        arr.add(root);
        if(root.val==num.val){
            return true;
        }
        if(findingPath(root.left,num,arr)==true||findingPath(root.right,num,arr)==true){
            return true;
        }
        arr.remove(arr.size()-1);
        return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       ArrayList<TreeNode> path1=new ArrayList<>();
        ArrayList<TreeNode> path2=new ArrayList<>();
        findingPath(root,p,path1);
        findingPath(root,q,path2);
        int n1=path1.size();
        int n2=path2.size();
        int n=Math.min(n1,n2);
        TreeNode res=null;
        int i=0;
      //Now comparing both lists and finding the breaking points at where the condition violates
      //therefore storing the res
        for(i=0;i<n;i++){
            if((path1.get(i)!=path2.get(i))&&i!=0){
                res=path1.get(i-1);
                break;
            }
     }
      //if the both nodes are descendants to one those...then the paths will be same ...so wee are storing the last one
        if(i==n){
            res=path1.get(i-1);
        }
        return res;
    }
}
