//return the top most k frequencied elements
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
   
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        List<Integer> l=new ArrayList(mp.keySet());
        Collections.sort(l, (a, b) -> (mp.get(b) - mp.get(a)));
    
        int res[]=new int[k];
        int i=0;
        while(i<k){
            res[i]=l.get(i);
            i++;
        }
        return res;
    }
}
