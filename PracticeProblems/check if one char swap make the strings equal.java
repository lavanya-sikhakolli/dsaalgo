//Buddy Strings
class Solution {
    public boolean buddyStrings(String s, String goal) {
        int m=s.length();
        int n=goal.length();
        int a=-1,b=-1,diff=0;
       if(m!=n){ return false;}
        int arr[]=new int[26];
        boolean flag=false;
        for(int i=0;i<m;i++){
            //if any character repeated more than once..then we can easily swap those two same characters...for that we are maintaining flag variable
            if(++arr[s.charAt(i)-'a']>=2){
                flag=true;
            }
            if(s.charAt(i)!=goal.charAt(i)){
                //we are finding the difference in characters from both the strings
                //if the difference is more than two....then with one swap ...we cant get the required string(goal)
                //if the difference is 2...we are storing the indices and those two characters should be equal ..then we can get the required goal
                diff++;
                if(a==-1){a=i;}
                else if(b==-1){b=i;}
            }
        }
        return ((diff==0 && flag==true)||(diff==2 && s.charAt(a)==goal.charAt(b) && s.charAt(b)==goal.charAt(a)));
    }
}
