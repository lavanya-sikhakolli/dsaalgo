class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<n-2;i++){
            if(i==0||i>0&& nums[i]!=nums[i-1]){
                int low=i+1,high=n-1,target=0-nums[i];
                while(low<high){
                    if(nums[low]+nums[high]==target){
                        ArrayList<Integer> res1=new ArrayList<>();
                        res1.add(nums[i]);
                        res1.add(nums[low]);
                        res1.add(nums[high]);
                        res.add(res1);
                        while(low<high && nums[low]==nums[low+1]){low++;}
                        while(low<high && nums[high]==nums[high-1]){high--;}
                        low++;
                        high--;
                    }
                    else if(nums[low]+nums[high]<target){low++;}
                    else{high--;}
                }
            }
        }
        return res;
    }
}
