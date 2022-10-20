class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<Integer>();
        for(int n:nums){
            q.add(n);
            if(q.size()>k){
                q.poll();
            }
        }
        return q.peek();
    }
}
