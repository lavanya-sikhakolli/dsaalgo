class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
       Arrays.sort(arr);
       Arrays.sort(dep);
      
        int a=1,d=0,res=1;
        while(a<n&& d<n){
            if(arr[a]>dep[d]){
                 d++;
            }
            else{
                res++;
            }
            a++;
        }
        
        return res;
    }
    
}
