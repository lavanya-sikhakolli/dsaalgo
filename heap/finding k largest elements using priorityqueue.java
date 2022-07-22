class Solution
{
    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        // code here 
        ArrayList<Integer> res=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int i=k;i<n;i++){
            if(arr[i]>pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        while(pq.isEmpty()==false){
            res.add(pq.poll());
        }
        int low=0,high=res.size()-1;
        while(low<high){
            int temp=res.get(low);
            res.set(low,res.get(high));
            res.set(high,temp);
            low++;
            high--;
        }
        return res;
    }
}
