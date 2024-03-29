import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.
        Arrays.sort(intervals,(a,b)->a.start-b.start);
        ArrayList<Interval> result=new ArrayList<Interval>();
        int n=intervals.length;
        for(int i=0;i<n;){
            int j=i+1;
            while(j<n && intervals[j].start<=intervals[i].finish){
                intervals[i].finish=Math.max(intervals[i].finish,intervals[j].finish);
                j++;
            }
            result.add(intervals[i]);
            i=j;
        }
        return result;
    }
}
