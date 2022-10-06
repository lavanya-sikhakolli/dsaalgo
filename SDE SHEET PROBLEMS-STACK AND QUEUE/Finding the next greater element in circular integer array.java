//By using the concept of stock span problem
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        int j=n-1;
        Stack<Integer> s=new Stack<Integer>();
        int i=0;
      //to get the greater element for the last element
        for( i=n-2;i>=0;i--){
            s.push(nums[i]);
        }
        while(s.isEmpty()==false &&s.peek()<=nums[n-1]){
            s.pop();
        }
        int a=s.isEmpty()?-1:s.peek();
        res[j]=a;
        j--;
        s.push(nums[n-1]);
      //to get the next greater element for the remaining elements
        for(i=n-2;i>=0;i--){
            while(s.isEmpty()==false && s.peek()<=nums[i]){
                s.pop();
            }
            int next=s.isEmpty()?-1:s.peek();
            res[j]=next;
            j--;
            if(j<0){ break;}
            s.push(nums[i]);
        }
        return res;
    }
}
