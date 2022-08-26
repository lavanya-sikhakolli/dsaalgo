import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        
       long res=countInv(arr,0,n-1);
        return res;
    }
    public static long countInv(long arr[],int l,int r){
        int res=0;
        if(l<r){
            int m=l+(r-l)/2;
            res+=countInv(arr,l,m);
            res+=countInv(arr,m+1,r);
            res+=countAndMerge(arr,l,m,r);
        }
            return res;
        
    }
    public static long countAndMerge(long arr[],int l,int m,int r){
        long count=0;
        int n1=m-l+1;
        int n2=r-m;
        long L[]=new long[n1];
        long R[]=new long[n2];
        for(int i=0;i<n1;i++){
            L[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            R[j]=arr[m+1+j];
        }
        int i=0,j=0,k=l;
        while(i<n1&&j<n2){
            if(L[i]<=R[j]){ arr[k]=L[i];
                          k++;
                          i++;}
            else{
                arr[k]=R[j];
                j++;
                k++;        //  firsthalf       secondhalf
                count+=n1-i;//[1,3,5]  ....   [2,4,6]......so whenever the ith element in the left part is greater than the jth element of second half....then the possible
            }                                     //  inversions are (number of elements in first half -current index)---->which is (n1-i);
        }                        
        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }
    
        return count;
    }
    
}
