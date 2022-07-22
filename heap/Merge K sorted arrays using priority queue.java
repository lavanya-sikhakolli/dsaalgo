class Triplet implements Comparable<Triplet>{
    int val,aPos,vPos;
    Triplet(int v,int ap,int vp){
        val=v;
        aPos=ap;
        vPos=vp;
    }
    public int compareTo(Triplet t){
        if(val<=t.val){return -1;}
        else { return 1;}
    }
    
}
class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        // Write your code here.
        ArrayList<Integer> res=new ArrayList<>();
        PriorityQueue<Triplet> pq=new PriorityQueue<Triplet>();
        for(int i=0;i<arr.length;i++){//..........to get the row size..........//
            pq.add(new Triplet(arr[i][0],i,0));
        }
        while(pq.isEmpty()==false){
            Triplet curr=pq.poll();
            res.add(curr.val);
            int ap=curr.aPos;
            int vp=curr.vPos;
            if(vp+1<arr.length){
                pq.add(new Triplet(arr[ap][vp+1],ap,vp+1));
            }
        }
        return res;
        
    }
}
