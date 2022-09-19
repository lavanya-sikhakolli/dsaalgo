import java.util.* ;
import java.io.*; 
public class Solution {
    public static double multiply(double mid,int n){
        double temp=1.0;
        for(int i=1;i<=n;i++){
            temp=temp*mid;
        }
        return temp;
    }
	public static double findNthRootOfM(int n, int m) {
		// Write your code here.
        double ans=1.0;
        double low=1,high=m;
        double eps=1e-8;
        while((high-low)>eps){
            double mid=low+(high-low)/2.0;
             if(multiply(mid,n)<m){
                low=mid;
            }
            else{
                high=mid;
            }
        }
        return low;
	}
}
