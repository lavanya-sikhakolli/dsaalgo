
class Solution {
   
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        int gap=(n+m)/2;
        while(gap>0){
            int p1=0,p2=gap;
            while(p2<m+n){
                if(p2<n &&p1<n&& arr1[p1]>arr1[p2]){
                    //swap(arr1[p1],arr1[p2]);
                    int temp=arr1[p1];
                    arr1[p1]=arr1[p2];
                    arr1[p2]=temp;
                }
                else if(p2>=n &&p1<n&&arr1[p1]>arr2[p2-n]){
                   // swap(arr1[p1],arr2[p2-n]);
                   int temp=arr1[p1];
                   arr1[p1]=arr2[p2-n];
                   arr2[p2-n]=temp;
                }
                else if(p2>=n && p1>=n && arr2[p1-n]>arr2[p2-n]){
                    //swap(arr2[p1-n],arr2[p2-n]);
                    int temp=arr2[p1-n];
                    arr2[p1-n]=arr2[p2-n];
                    arr2[p2-n]=temp;
                }
                p1++;
                p2++;
            }
            gap=gap/2;
        }
        if(k-1<n){
            return (long)arr1[k-1];
        }
        else if(k-1==n){
            return (long)arr2[0];
        }
        else if(k-1>n){
            return (long)arr2[(k-1)-n];
        }
       return (long)1; 
    }
}
