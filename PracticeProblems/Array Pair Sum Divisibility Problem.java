class Solution {
    public boolean canPair(int[] nums, int k) {
        // Code here
      /*  Intution:

How can we solve this problem using two pointer? We can do it greedily after having some observations
let the given array be Arr = [9, 5, 7, 3], k = 6 
we can observe that for each element we need some part to be added such that it become divisible by k, To find the needed part we do mod of every element in Arr with k
That is Arr = [9%k, 5%k, 7%k, 3%k] == [3, 5, 1, 3] (This is needed part for each element)
Algorithm

Create a temp array which contain the needed part that is, temp[i] = arr[i] % k
One thing to keep in mind is first check if arr[i] % k == 0 or not
if yes then dont push it in the temp since that number can only pair with its duplicate, instead count++ which will keep track of numbers which are already divisible by k
else push arr[i] % k in temp vector/arraylist
sort the temp vector/arraylist, because for each number the required part is present at the end 
now using two pointer keep check if temp[start] + temp[end] == k or not
if not return false
else move the pointer start++, end--*/
    int n=nums.length;
    if(n<2){ return false;}
    int count=0;
    ArrayList<Integer> arr=new ArrayList<>();
    for(int i=0;i<n;i++){
        if(nums[i]%k==0){ count++;}
        else{
            arr.add(nums[i]%k);
        }
    }
    if(count%2==1){ return false;}
    Collections.sort(arr);
    int start=0;
    int end=arr.size()-1;
    while(start<end){
        if(arr.get(start)+arr.get(end)==k){
            start++;
            end--;
        }
        else{
            return false;
        }
    }
       return true; 
    }
}
