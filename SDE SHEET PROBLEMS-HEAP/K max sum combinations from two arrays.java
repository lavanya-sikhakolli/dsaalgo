import java.util.* ;
import java.io.*; 
public class Solution{
	public static ArrayList<Integer> kMaxSumCombination(ArrayList<Integer> a, ArrayList<Integer> b, int n, int k){
		// Write your code here.
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(k);
        for(int i=0;i<a.size();i++){
            for(int j=0;j<b.size();j++){
                if(pq.size()<k){
                    pq.add(a.get(i)+b.get(j));
                }
                else{
                    if(a.get(i)+b.get(j)>pq.peek()){
                        pq.poll();
                        pq.add(a.get(i)+b.get(j));
                    }
                }
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        while(!pq.isEmpty()){
            res.add(0,pq.poll());
        }
        return res;
	}
}
