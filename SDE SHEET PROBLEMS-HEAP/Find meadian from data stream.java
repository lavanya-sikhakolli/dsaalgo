public class Solution {

	public static void findMedian(int arr[])  {
        if(arr.length==0){
            return;
        }
    PriorityQueue<Integer> s=new PriorityQueue<Integer>(Collections.reverseOrder());
                                                    
        PriorityQueue<Integer> g=new PriorityQueue<Integer>();
        s.add(arr[0]);
        System.out.print(arr[0]+" ");
        for(int i=1;i<arr.length;i++){
            int x=arr[i];
            if(s.size()>g.size()){
                if(s.peek()>=x){
                    s.add(x);
                    g.add(s.poll());
                }
                else{
                    g.add(x);
                }
                System.out.print((s.peek()+g.peek())/2+" ");
            }
            else{
                if(s.peek()>=x){
                    s.add(x);
                }
                else{
                    g.add(x);
                    s.add(g.poll());
                }
                System.out.print(s.peek()+" ");
            }
        }
    }

}
