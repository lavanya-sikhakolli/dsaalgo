//By using the concept of stock span problem
public class Solution {
    public int[] prevSmaller(int[] A) {
        int n=A.length;
        int res[]=new int[n];
        int j=1;
        res[0]=-1;
        Stack<Integer> s=new Stack<Integer>();
        s.push(A[0]);
        for(int i=1;i<n;i++){
            while(s.isEmpty()==false && s.peek()>=A[i]){
                s.pop();
            }
            int ns=s.isEmpty()?-1:s.peek();
            res[j]=ns;
            j++;
            s.push(A[i]);
         }
        return res;
    }
}
