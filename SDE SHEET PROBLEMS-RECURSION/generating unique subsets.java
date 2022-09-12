class Solution {
    public void func(int ind,int[] nums,List<List<Integer>> res,List<Integer> temp){
        res.add(new ArrayList<>(temp));
        for(int i=ind;i<nums.length;i++){
            if(i!=ind && nums[i]==nums[i-1]){ continue;}//to skip the common elements
            temp.add(nums[i]);
            func(i+1,nums,res,temp);
            temp.remove(temp.size()-1);
            
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        func(0,nums,res,new ArrayList<>());
        return res;
    }
}


//if the given array is containing only the unique elements
public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(list, new ArrayList<>(), nums, 0);
    return list;
}

private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
    list.add(new ArrayList<>(tempList));
    for(int i = start; i < nums.length; i++){
        tempList.add(nums[i]);
        backtrack(list, tempList, nums, i + 1);
        tempList.remove(tempList.size() - 1);
    }
}
