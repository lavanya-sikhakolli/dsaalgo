//Anagram is nothing but whether the both strings are permutation of each other

class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(m!=n){
            return false;
        }
        int count[]=new int[256];
        for(int i=0;i<n;i++){
            count[s.charAt(i)]++;
            count[t.charAt(i)]--;
        }
        for(int i=0;i<256;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
}
