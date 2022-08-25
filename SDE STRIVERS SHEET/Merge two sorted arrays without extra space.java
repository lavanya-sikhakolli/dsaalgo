// if input arr1=[1,2,3,8,10,0,0,0] ,arr2=[4,7,9]..........then output will be arr1=[1,2,3,4,7,8,9,10].
import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int a1=0,a2=0;
        while(a1<m+n && a2<n){
            if(arr1[a1]>arr2[a2]){
          
                int temp=arr1[a1];
                arr1[a1]=arr2[a2];
                arr2[a2]=temp;
            }
            Arrays.sort(arr2);
            if(arr1[a1]==0){
                arr1[a1]=arr2[a2];
                a2++;
            }
            a1++;
        }
        
        return arr1;
    }
}

//if arr1[]=[1,2,3,8,10],arr2=[4,7,9],..........output will be.....arr1[]=[1,2,3,4,7],arr2[]=[8,9,10] for the below code;......which is called as gap method//
import java.util.* ;
import java.io.*; 
public class Solution {
    public static void ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int gap=(m+n)/2;
        while(gap>0){
            int p1=0,p2=gap;
            while( p2<m+n){
                if(p2<m && arr1[p1]>arr1[p2]){
                    int temp=arr1[p1];
                    arr1[p1]=arr1[p2];
                    arr1[p2]=temp;
                }
                else if(p2>=m && arr1[p1]>arr2[p2-m]){
                    int temp=arr1[p1];
                    arr1[p1]=arr2[p2-m];
                    arr2[p2-m]=temp;
                }
                else if(p2>=m && p1>=m && arr2[p1-m]>arr2[p2-n]){
                    int temp=arr2[p1-m];
                    arr2[p1-m]=arr2[p2-m];
                    arr2[p2-m]=temp;
                }
                p2++;
                p1++;
            }
   
                    gap=gap/2;
              }
      
        return ;
    }
}
