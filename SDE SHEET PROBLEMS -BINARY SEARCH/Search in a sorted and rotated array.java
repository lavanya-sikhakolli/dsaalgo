//Using binary search
class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int low=0,high=n-1;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){ return mid;}
            else if(nums[low]<=nums[mid]){
                //left subarray is sorted
                if(target>=nums[low]&&target<nums[mid]){
                    //if the element to be search in the array is lie in that range 
                    high=mid-1;
                }
                else{
                    //if not....check with the other range
                    low=mid+1;
                }
            }
            else{
                //right subarray is sorted
                if(target>nums[mid]&& target<=nums[high]){
                    //if the element to be search in the array is lie in that range
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
