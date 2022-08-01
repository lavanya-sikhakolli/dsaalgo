class Pair{
    int start;
    int end;
    Pair(int s,int e){ start=s;
    end=e;}
}
 class mycmp implements Comparator<Pair>{
    public int compare(Pair p1,Pair p2){
        return p1.end-p2.end;
    }
}

class Solution
{
    //Function to find the maximum number of activities that can
    //be performed by a single person.
    public static int activitySelection(int start[], int end[], int n)
    {
        // add your code here
        ArrayList<Pair>p=new ArrayList<Pair>();
        for(int i=0;i<n;i++){
            Pair p1=new Pair(start[i],end[i]);
            p.add(p1);
        }
        Collections.sort(p,new mycmp());
        int prev=p.get(0).end;
        int res=1;
        for(int i=1;i<n;i++){
            if(p.get(i).start>prev){
                res++;
                prev=p.get(i).end;
            }
        }
        return res;
    }
}
