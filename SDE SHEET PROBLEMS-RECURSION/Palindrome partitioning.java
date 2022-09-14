class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        func(s,res,new ArrayList<>(),0);
        return res;
    }
    public void func(String s,List<List<String>> res,List<String> temp,int start){
        if(start==s.length()){
            res.add(new ArrayList<>(temp));
        }
        else{
            for(int i=start;i<s.length();i++){
                if(isPalindrome(s,start,i)==true){
                    temp.add(s.substring(start,i+1));
                    func(s,res,temp,i+1);
                    temp.remove(temp.size()-1);
                }
            }
        }
    }
    public boolean isPalindrome(String s,int low,int high){
        while(low<high){
            if(s.charAt(low)!=s.charAt(high)){
                return false;
            }
            low++;high--;
            
        }
        return true;
    }
}
