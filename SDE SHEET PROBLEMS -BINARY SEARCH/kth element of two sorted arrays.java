
class Solution{
public:

    //time  : O(log(min(n,m)))
    //space : O(1)
    int kthElement(int arr1[], int arr2[], int n, int m, int k)
    {
        //if arr2 is smaller swap arr1 and arr2
        if(m<n) return kthElement(arr2,arr1,m,n,k);
        
        //note we need kth element n is smaller
        //n for arr1 ie smaller and m for arr2 ie greater
        
        //if k>m then taking 0 from arr1 and k from arr2 is not possible
        //we have to take atleast k-m from arr1
        //hence keep low as max(0,k-m)
        int low = max(0,k-m);
        //if k<n then taking all elements from arr1 is not possible
        //we can pick atmost k from arr1 and 0 from arr2
        //hence keep high as min(k,n)
        int high = min(n,k);
        
        while(low <= high){
            int cut1 = low + high >> 1;
            int cut2 = k - cut1;
            
            int l1 = (cut1==0) ? INT_MIN : arr1[cut1-1];
            int l2 = (cut2==0) ? INT_MIN : arr2[cut2-1];
            
            int r1 = (cut1==n) ? INT_MAX : arr1[cut1];
            int r2 = (cut2==m) ? INT_MAX : arr2[cut2];
            
            //valid cut
            if(l1 <= r2 && l2 <= r1){
                //ie kth element 
                return max(l1,l2);
            }
            //reduce l1 -> cut move to left side in arr1
            else if(l1 > r2) { high = cut1 - 1; }
            //l2 > r1 increase r1 -> cut move to right side in arr1
            else { low = cut1 + 1; }
        }
    }
};

