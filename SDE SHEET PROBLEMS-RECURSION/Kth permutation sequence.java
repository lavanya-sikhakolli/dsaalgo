//the brute force approach is....by writing the recursive function and generating all the permutations and sorting the list and returning the (k-1)th index from the list.
//optimal approach
class Solution {
    public String getPermutation(int n, int k) {
        String ans="";
        ArrayList<Integer> nums=new ArrayList<Integer>();
        int fact=1;
        for(int i=1;i<n;i++){
            fact=fact*i;
            nums.add(i);
        }
        nums.add(n);
        k=k-1;
        while(true){
            ans=ans+nums.get(k/fact);
            nums.remove(k/fact);
            if(nums.size()==0){
                break;
            }
            k=k%fact;
            fact=fact/nums.size();
        }
        return ans;
    }
}
