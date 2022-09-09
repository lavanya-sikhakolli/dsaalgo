//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> res=new ArrayList<Integer>();
        func(0,0,arr,N,res);
        
        Collections.sort(res);
        return res;
    }
    void func(int ind,int sum,ArrayList<Integer> arr,int N,ArrayList<Integer> res){
        if(ind==N){
            res.add(sum);
            return;
        }
      //for every subset we are having 2 possibilities....whether to pick the element or not to pick 
      //to pick the element and updating the sum
        func(ind+1,sum+arr.get(ind),arr,N,res);
      //not picking the element and sum remains same
        func(ind+1,sum,arr,N,res);
    }
}
