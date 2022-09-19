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

...
    ............
    .........
    ......
    //returning all the permutations of a given string
    public class Permutation 
{ 
    public static void main(String[] args) 
    { 
        String str = "ABC"; 
        int n = str.length(); 
        Permutation permutation = new Permutation(); 
        permutation.permute(str, 0, n-1); 
    } 
  
    /** 
    * permutation function 
    * @param str string to calculate permutation for 
    * @param l starting index 
    * @param r end index 
    */
    private void permute(String str, int l, int r) 
    { 
        if (l == r) 
            System.out.println(str); 
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                permute(str, l+1, r); 
                str = swap(str,l,i); 
            } 
        } 
    } 
  
    /** 
    * Swap Characters at position 
    * @param a string value 
    * @param i position 1 
    * @param j position 2 
    * @return swapped string 
    */
    public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
  
} 


// returning the permutations using backtracking
