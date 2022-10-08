import java.util.*;
class Solution {
    public String reverseWords(String s) {
        String res="";
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==' '){continue;}//for skipping the spaces
            int r=i;   //making note of the end of the word
            while(i>=0 && s.charAt(i)!=' '){ i--;}//finding the starting point of the string 
            for(int j=i+1;j<=r;j++){
                res+=s.charAt(j);  //adding that string to the resultant string 
            }
            res+=" "; //adding space between each word 
        }
         String res1=res.trim();//removing the space at the end of the sentence
        return res1;
    }
}
