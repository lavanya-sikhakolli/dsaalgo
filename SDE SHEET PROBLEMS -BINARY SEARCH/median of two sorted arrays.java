class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int m=nums1.length;
        int n=nums2.length;
        double res1=0.0;
       if(m<=n){
         res1=func(nums1,nums2,m,n);}
        else {
        res1=func(nums2,nums1,n,m);
        }
        return res1;
    }
    public double func(int[] nums1,int[] nums2,int m,int n){
        int beg1=0,end1=m;
        double res=0.0;
        while(beg1<=end1){
            int i1=(beg1+end1)/2;
            int i2=(m+n+1)/2-i1;
            int min1=(i1==m)?Integer.MAX_VALUE:nums1[i1];
            int max1=(i1==0)?Integer.MIN_VALUE:nums1[i1-1];
            int min2=(i2==n)?Integer.MAX_VALUE:nums2[i2];
            int max2=(i2==0)?Integer.MIN_VALUE:nums2[i2-1];
            if(max1<=min2 && max2<=min1){
                if((n+m)%2==0){
                    return (double)(Math.max(max1,max2)+Math.min(min1,min2))/2;
                }
                else{
                    return (double)(Math.max(max1,max2));
                }
            }
            else if (max1>min2){end1=i1-1;}
            else{beg1=i1+1;}
        }
        return res;
    }
}
   
   
