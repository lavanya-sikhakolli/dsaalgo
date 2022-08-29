//Optimised solution: TC:O(2N)
           //         SC:O(N)

import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String input) 
    {
		//write your code here
        int n=input.length();
        if(n<=1){ return n;}
        int maxans=0;
        Set<Character> set=new HashSet<>();
        int l=0;
        for(int r=0;r<n;r++){
            if(set.contains(input.charAt(r))){
                while(l<r && set.contains(input.charAt(r))){
                    set.remove(input.charAt(l));
                    l++;
                }
            }
            set.add(input.charAt(r));
            maxans=Math.max(maxans,r-l+1);
        }
       return maxans;
	}
}

//Most Optimised solution...TC:O(N)  and SC:O(N)


import java.util.*;
public class Main {
    static int solve(String s) {
        HashMap < Character, Integer > mpp = new HashMap < Character, Integer > ();

        int left = 0, right = 0;
        int n = s.length();
        int len = 0;
        while (right < n) {
            if (mpp.containsKey(s.charAt(right))) left = Math.max(mpp.get(s.charAt(right)) + 1, left);

            mpp.put(s.charAt(right), right);

            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }
