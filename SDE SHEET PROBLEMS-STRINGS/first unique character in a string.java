//By two traversals

class Solution {
    public int firstUniqChar(String s) {
       int n=s.length();
        int arr[]=new int[26];
        for(int i=0;i<n;i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            if(arr[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
