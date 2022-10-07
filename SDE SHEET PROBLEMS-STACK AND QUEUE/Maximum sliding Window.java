class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int res[]=new int[n-k+1];
        int ri=0;
        Deque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            //ie we are removing the elements which are out of range for k window from the front
            if(q.isEmpty()==false && q.peek()==i-k){
                q.poll();
            }
            //ie we are storing the elements in decreasing order which is similar to next greater element
            //suppose...[0,-1]...if we want to add 3 to the window ,then we can remove the -1 and 0...since they are anyways less than 3(useless)
            //we are removing the small elements in the k range
            while(q.isEmpty()==false && nums[q.peekLast()]<=nums[i]){
                q.pollLast();
            }
            q.offer(i);
            if(i>=k-1){
                res[ri++]=nums[q.peek()];
            }
        }
        return res;
    }
}
