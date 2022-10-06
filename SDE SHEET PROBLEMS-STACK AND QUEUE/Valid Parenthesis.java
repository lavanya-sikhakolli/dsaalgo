class Solution {
    public boolean isMatching(char ch,char b){
        if((ch==')'&&b=='(')||(ch=='}'&&b=='{')||(ch==']'&&b=='[')){
            return true;
        }
        return false;
    }
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character>s1=new Stack<Character>();
        for(int i=0;i<n;i++){
        char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                s1.push(ch);
            }
            else{
                if(s1.isEmpty()==true){ return false;}// if the first element itself is closed bracet
               else if (isMatching(ch,s1.peek())==false){
                    return false;
                }
                else {
                    s1.pop();    //if isMatching returns true..then we need to pop the element
                }
            }
        }
        return (s1.isEmpty()==true);
    }
}
