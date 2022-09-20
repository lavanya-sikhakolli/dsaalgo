import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean isPossible(int[] positions,int c,int min){
        int cnt=1;
        int lastPlaced=positions[0];
        for(int i=1;i<positions.length;i++){
            if(positions[i]-lastPlaced>=min){
                cnt++;
                lastPlaced=positions[i];
            }
        }
        if(cnt>=c){ return true;}
        return false;
    }
    public static int chessTournament(int[] positions, int n,  int c) 
	{
        // Write your code here.  
        Arrays.sort(positions);
        int low=1,high=positions[n-1]-positions[0];
        while(low<=high){
            int mid=low+(high-low)/2;
            if((isPossible(positions,c,mid))==true){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return high;
    }

}
