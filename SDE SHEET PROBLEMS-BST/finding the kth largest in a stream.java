class KthLargest {
     final int k;
   final PriorityQueue<Integer> g;
   
    public KthLargest(int k, int[] nums) {
        this.k=k;
      g=new PriorityQueue<Integer>(k);
        for(int n:nums){
            g.add(n);
            if(g.size()>k){ g.poll();}//if g contains more than k elements..popping the 
            //smallest element
        }
    }
    
    public int add(int val) {
       if(g.size()<k){
           g.add(val);
       }
        else if(g.peek()<val){
            g.poll();
            g.add(val);
        }
        return g.peek();
    }
}
