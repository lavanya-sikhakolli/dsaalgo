public class Solution {
    public int[] dNums(int[] A, int B) {
        int n=A.length;
        int ans=0;
        int j=0;
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        int res[]=new int[n-B+1];
      //for first k elements...if there is a unique element ..then we are incrementing the ans and adding it to the resultant array
        for(int i=0;i<B;i++){
            if(!mp.containsKey(A[i])){
                mp.put(A[i],1);
                ans++;
            }
            else{
              //updating the value for the key without updating  the ans
                mp.put(A[i],mp.get(A[i])+1);
            }
        }
        res[j]=ans;
        j++;
        for(int i=B;i<n;i++){
          //for window size ...reomiving the first element of the previous window and adding the next elemnt to next window
            mp.put(A[i-B],mp.get(A[i-B])-1);
            if(mp.get(A[i-B])==0){ ans--;}
          //if the element is already present from the previous with value as 0,then while counting the distinct in curr window ...we need to update the ans.
            if(!mp.containsKey(A[i])||mp.get(A[i])==0){
                mp.put(A[i],1);
                ans++;
            }
            else{ mp.put(A[i],mp.get(A[i])+1);}
            res[j]=ans;
            j++;
        }
        return res;
    }
}
