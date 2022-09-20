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
