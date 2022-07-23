class Solution
{
    static PriorityQueue<Integer> g=new PriorityQueue<Integer>();
    static PriorityQueue<Integer> s=new PriorityQueue<Integer>(Collections.reverseOrder());
    //Function to insert heap.
    public static void insertHeap(int x)
    {
        // add your code here
       if(s.size()==0 ||s.peek()>x){
           s.add(x);
       }
       else{
           g.add(x);
       }
        balanceHeaps();
    }
    
    //Function to balance heaps.
    public static void balanceHeaps()
    {
       // add your code here
       if(s.size()>g.size()+1){
           g.add(s.poll());
       }
       else if(g.size()>s.size()){
           s.add(g.poll());
       }
    }
    
    //Function to return Median.
    public static double getMedian()
    {
        // add your code here
        if(s.size()==g.size()){
        return (double)(s.peek()+g.peek())/2;}
        else {
            return (double)(s.peek());
        }
    }
    
}
