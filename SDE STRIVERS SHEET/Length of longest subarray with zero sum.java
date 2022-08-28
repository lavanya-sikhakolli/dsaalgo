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

//the approach here we are following is we are storing the prefix sum of each element
//6 -2 2 -8  1  7  4  -10...array
//6  4  6 -2 -1 6 10   0....prefix sum
//so...whenever the prefix sum is same for the elemets ...that means the in between adding elemets sum is 0,update the max accordingly.
//if sum is 0..then update max as i+1
