public class Solution {
    public int[] solve(TreeNode A, int B) {
        ArrayList<Integer> arr=new ArrayList<>();
        path(A,B,arr);
        int n=arr.size();
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=arr.get(i);
        }
        return res;
            }
     public boolean path(TreeNode root,int v,ArrayList<Integer> arr){
              if(root==null){
                  return false;
              }  
              arr.add(root.val);
              if(root.val==v){
                  return true;
              }
       //if both left and right of an element is null or returns false then that element is useless...that is not present in the path...so we will remove 
       //the last element from the arraylist
              if(path(root.left,v,arr)==true||path(root.right,v,arr)==true){
                  return true;
              }
              arr.remove(arr.size()-1);
              return false;
     }
}
