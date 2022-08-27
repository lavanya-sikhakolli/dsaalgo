//whether 4 elments are present or not 
import java.util.* ;
import java.io.*; 
public class Solution {
  public static String fourSum(int[] arr, int target, int n) {
      // Write your code here.
      Arrays.sort(arr);
      for(int i=0;i<n;i++){
          int target1=target-arr[i];
          for(int j=i+1;j<n;j++){
              int target2=target1-arr[j];
              int front =j+1;
              int back=n-1;
              while(front<back){
                  if(arr[front]+arr[back]==target2){
                      return "Yes";
                  }
                  else if(arr[front]+arr[back]<target2){
                      front++;
                  }
                  else{
                      back--;
                  }
              }
          }
      }
          return "No";
    }
}







//returning the unique quadraplets
import java.io.*; 
import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] num, int target) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        
        if (num == null || num.length == 0)
            return res;
        
        int n = num.length;
    
        Arrays.sort(num); 
    
        for (int i = 0; i < n; i++) {
        
            int target_3 = target - num[i];
        
            for (int j = i + 1; j < n; j++) {
            
                int target_2 = target_3 - num[j];
            
                int front = j + 1;
                int back = n - 1;
            
                while(front < back) {
                
                    int two_sum = num[front] + num[back];
                
                    if (two_sum < target_2) front++;
                
                    else if (two_sum > target_2) back--;
                
                    else {
                    
                        List<Integer> quad = new ArrayList<>(); 
                        quad.add(num[i]);
                        quad.add(num[j]);
                        quad.add(num[front]);
                        quad.add(num[back]);
                        res.add(quad);
                    
                        // Processing the duplicates of number 3
                        while (front < back && num[front] == quad.get(2)) ++front;
                    
                        // Processing the duplicates of number 4
                        while (front < back && num[back] == quad.get(3)) --back;
                
                    }
                }
                
                // Processing the duplicates of number 2
                while(j + 1 < n && num[j + 1] == num[j]) ++j;
            }
        
            // Processing the duplicates of number 1
            while (i + 1 < n && num[i + 1] == num[i]) ++i;
        
        }
        
    
        return res;
    }
};
class TUF {
	public static void main (String[] args) {
		int arr[] = {1,0,-1,0,-2,2}; 
		int target = 0;
		Solution sol = new Solution(); 
		List<List<Integer>> ls = sol.fourSum(arr, target); 
		//System.out.println("raj");
		for(int i = 0;i<ls.size();i++) {
		    for(int j = 0;j<ls.get(i).size();j++) {
		        System.out.print(ls.get(i).get(j) + " "); 
		    }
		    System.out.println(); 
		}
	}
}
