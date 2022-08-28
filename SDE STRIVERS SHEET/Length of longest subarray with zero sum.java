import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
        HashMap<Integer,Integer> mpp=new HashMap<Integer,Integer>();
        int n=arr.size();
        int max=0,sum=0;
        for(int i=0;i<n;i++){
            sum+=arr.get(i);
            if(sum==0){
                max=i+1;
            }
            else{
                if(mpp.get(sum)!=null){
                    max=Math.max(max,i-mpp.get(sum));
                }
                else{
                    mpp.put(sum,i);
                }
            }
        }
        return max;
	}
}
