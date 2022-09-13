//if we can use the elements any number of times 
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
       // int n=candidates.length;
        Arrays.sort(candidates);
        func(res,new ArrayList<>(),candidates,target,0);
        return res;
    }
    public void func(List<List<Integer>> res,List<Integer> temp,int[] candidates,int remain,int start){
        if(remain<0){return;}
        else if(remain==0){
            res.add(new ArrayList<>(temp));
        }
        else{
            for(int i=start;i<candidates.length;i++){
                temp.add(candidates[i]);
                func(res,temp,candidates,remain-candidates[i],i);//not i+1...because we can use the same element any number of times
                temp.remove(temp.size()-1);
            }
        }
    }
}
//if we can use the elemnts only once and generate the unique combinations
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        func(res,new ArrayList<>(),candidates,target,0);
        return res;
    }
    public void func(List<List<Integer>> res,List<Integer> temp,int[] candidates,int remain,int start){
        if(remain<0){ return;}
        else if(remain==0){res.add(new ArrayList<>(temp));}
        else{
            for(int i=start;i<candidates.length;i++){
                if(i!=start && candidates[i]==candidates[i-1]){continue;}
                temp.add(candidates[i]);
                func(res,temp,candidates,remain-candidates[i],i+1);//here i+1...because we have to use the element only once
                temp.remove(temp.size()-1);
            }
        }
    }
}
