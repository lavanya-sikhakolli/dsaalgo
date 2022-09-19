class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        func(nums,0,res);
        return res;
    }
    public void func(int[] nums,int index,List<List<Integer>> res){
        if(index==nums.length){
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                temp.add(nums[i]);
            }
            res.add(temp);
            return;
        }
        else{
            for(int i=index;i<nums.length;i++){
                swap(i,index,nums);
                func(nums,index+1,res);
                swap(i,index,nums);
            }
        }
    }
    public void swap(int l,int r,int[] nums ){
        int t=nums[l];
        nums[l]=nums[r];
        nums[r]=t;
    }
}
