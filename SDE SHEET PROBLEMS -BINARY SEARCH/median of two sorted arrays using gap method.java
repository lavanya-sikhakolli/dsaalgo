class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int gap=(m+n)/2;
        double res=0.0;
        while(gap>0){
            int p1=0;
            int p2=gap;
            while(p2<m+n){
                if(p2<m &&nums1[p1]>nums1[p2]){
                    swap(nums1[p1],nums1[p2]);
                }
                else if(p2>=m && nums1[p1]>nums2[p2-m]){
                    swap(nums1[p1],nums2[p2-m]);
                }
                else if(p2>=m && p1>=m && nums2[p1-m]>nums2[p2-m]){
                    swap(nums2[p1-m],nums2[p2-m]);
                }
                p2++;
                p1++;
            }
            gap=gap/2;
        }
        int mid=(m+n)/2;
        if(mid%2==0){
           if(mid<=m-1){
            res=(double)(nums1[mid]+nums1[mid-1])/2;
            return res;
        }
          else if(mid==m){
            res=(double)(nums1[mid-1]+nums2[0])/2;
            return res;
        }
          else if(mid>=m){
            res=(double)(nums2[m-mid]+nums2[m-mid+1])/2;
            return res;
        }
    
        }
        else{
            if(mid<m){
                return (double)nums1[mid];
            }
            else if(mid==m){
                return (double)nums2[0];
            }
            else{
                return (double)nums2[m-mid];
            }
        }
        return res;
    }
    public void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
}