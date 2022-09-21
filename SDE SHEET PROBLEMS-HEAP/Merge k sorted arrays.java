class Triplet implements Comparable<Triplet>{
    int val,aPos,vPos;
    Triplet(int v,int ap,int vp){
        val=v;
        aPos=ap;
        vPos=vp;
    }
    public int compareTo(Triplet t){
        if(val<=t.val){
            return -1;
        }
        else{
            return 1;
        }
    }
}
public class Solution 
{
   
	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
	{
		// Write your code here.
        ArrayList<Integer> res=new ArrayList<Integer>();
        PriorityQueue<Triplet> pq=new PriorityQueue<Triplet>();
        for(int i=0;i<k;i++){
            pq.add(new Triplet(kArrays.get(i).get(0),i,0));
        }
            while(pq.isEmpty()==false){
                Triplet curr=pq.poll();
                res.add(curr.val);
                int v=curr.val;
                int ap=curr.aPos;
                int vp=curr.vPos;
                if(vp+1<kArrays.get(ap).size()){
                    pq.add(new Triplet(kArrays.get(ap).get(vp+1),ap,vp+1));
                }
            }
        
        return res;
	}
}
