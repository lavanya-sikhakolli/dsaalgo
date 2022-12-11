class Solution {
    static int MOD=1000000007;
    public int maxProduct(TreeNode root) {
        ArrayList<Long> sums=new ArrayList<>();
        //getting the total sum from the helper class and storing it in total
        long total=helper(root,sums);
        long maxi=0;
        for(long i:sums){
             long res=i*(total-i);
             maxi=Math.max(res,maxi);
         }
        return (int)(maxi%MOD);
    }
    public long helper(TreeNode root,ArrayList<Long> sums){
        if(root==null){
            return 0;
        }
       long lsum= helper(root.left,sums);
        long rsum= helper(root.right,sums);
        long sum=lsum+rsum+root.val;
        //storing all the individual tree sums into a list for future use
        sums.add(sum);
        return sum;
    }
}
