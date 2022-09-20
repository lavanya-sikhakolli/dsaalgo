class Solution {
    public int singleNonDuplicate(int[] nums) {
        int res=0;
        int n=nums.length;
        if(nums.length==1){ return nums[0];}
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                res=nums[i];
                return nums[i];
            }
            else{
                i++;
            }
        }
        if(nums[n-2]!=nums[n-1]){  //if condition is used to check the corner case 
            res=nums[n-1];
            return res;
        }
        return res;
    }
}

//by implementing using XOR
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int res=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            res=res^nums[i];
        }
        return res;
    }
}
//by implementing using binary search
class Solution{
    public int singleNonDuplicate(int[] nums){
        int low=0,high=nums.length-2;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid%2==0){
                if(nums[mid]!=num[mid+1]){
                    high=mid-1;}
                else{
                    low=mid+1;}
            }
            else{
                if(nums[mid]==nums[mid+1]){
                    high=mid-1;}
                else{
                    low=mid+1;}
            }
        }
            return nums[low];
    }
}
        
