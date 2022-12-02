class Solution {
    //Except corner cases...
    //for ex:S=#A#B#B#
    //        T=A###B#B
    //simply we can compare both the strings by removing # character.
    //Corner case are:S=###B T=B###....S=A### T=###A ...which are not possible bacause 
    //cannot move to the right position anymore and A cannot move left anymore
    int isItPossible(String S, String T, int M, int N) {
        // code here
        if(M!=N){ return 0;}
        int i=0,j=0;
        while(i<M && j<N){
            //skipping the hashtag and pointing i and j to the next characters 
            while(i!=M && S.charAt(i)=='#' ){ i++;}
            while(j!=N &&T.charAt(j)=='#' ){ j++;}
            
            if(i>=M && j<N){ return 0;}
            //there are more number of hashtags in one strings than the other...
            if(i<M && j>=N){ return 0;}
            if(i!=M && j!=N){
                
            if(S.charAt(i)!=T.charAt(j)){ return 0;}
            else{
                //if the character is A and it is the present at the left than the other string
                //similarly for the characcter B.
                if(S.charAt(i)=='A' && i<j){ return 0;}
                else if(S.charAt(i)=='B' && i>j){ return 0;}
            }
            }
            i++;
            j++;
        }
        return 1;
    }
};
