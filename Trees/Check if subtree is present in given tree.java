class Solution {
   
  public static boolean isMatch(Node T,Node S){
       if(T==null && S==null){ return true;}
       if(T==null || S==null){ return false;}
       boolean l=isMatch(T.left,S.left);
       boolean r=isMatch(T.right,S.right);
       return (l==true && r==true && T.data==S.data);
   }
   
 public static boolean isSubtree(Node T, Node S) {
        // add code here.
        if(T==null){ return false;}
        if(S==null){ return true;}
        if(T.data==S.data && isMatch(T,S)==true){
            return true;
        }
        boolean l=isSubtree(T.left,S);
        boolean r=isSubtree(T.right,S);
         return (l==true|| r==true);
   }
}
