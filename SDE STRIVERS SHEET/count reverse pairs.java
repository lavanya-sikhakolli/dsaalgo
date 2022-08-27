//which is similar to count inversions by using merge sort algo.....arr[i]>2*arr[j] where(i<j)
//here we need to compare the each element on the left half with each element on the right half
//left half contains....[28,29].......right half contains........[12,13]
//when i is pointing to 28 and j is pointing to 12......we are comparing 28 with 2*12.....which is true...now j points to 13....again...28>2*13....now increment j
//which is greater than i....now count is j-(current index of second half)
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static int reversePairs(ArrayList<Integer> arr) 
    {
        // Write your code here.
        int n=arr.size();
        int res=mergeSort(arr,0,n-1);
        return res;
    }
    public static int mergeSort(ArrayList<Integer> arr,int low,int high){
       if(low>=high){ return 0;}
        int mid=low+(high-low)/2;
        int count=mergeSort(arr,low,mid);
        count+=mergeSort(arr,mid+1,high);
        count+=merge(arr,low,mid,high);
        return count;
    }
    public static int merge(ArrayList<Integer> arr,int low,int mid,int high){
        int cnt=0;
        int j=mid+1;
        for(int i=low;i<=mid;i++){
          j=mid+1;
            while(j<=high && arr.get(i)>2*arr.get(j)){
                j++;
            }
            cnt+=(j-(mid+1));
        }
        ArrayList<Integer> temp=new ArrayList<>();
        int left=low,right=mid+1;
        while(left<=mid && right<=high){
        if(arr.get(left)<arr.get(right)){
            temp.add(arr.get(left++));
        }
            else{
                temp.add(arr.get(right++));
            }
            }
        while(left<=mid){temp.add(arr.get(left++));}
        while(right<=high){temp.add(arr.get(right++));}
        for(int i=low;i<=high;i++){
            arr.set(i,temp.get(i-low));
        }
        return cnt;
    }
}
