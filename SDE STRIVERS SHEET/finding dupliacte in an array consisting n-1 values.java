import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        int result=0;
        for(int i=0;i<n;i++){
            int idx=Math.abs(arr.get(i))-1;
            if(arr.get(idx)>0){
                arr.set(idx,-arr.get(idx));
            }
            else{
                result=idx+1;
                return result;
            }
          }
        return result;
    }
}
