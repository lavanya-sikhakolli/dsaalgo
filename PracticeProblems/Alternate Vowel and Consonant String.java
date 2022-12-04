class Solution{
    public String rearrange(String S, int N){
          int[] arr1 = new int[26];
          int[] arr2 = new int[26];
        
        int vowels =0;
        int consnt = 0;
        //making a note of smallest consonant and smallest vowel ...if the count of both are 
        //same ...then by using these two ...we can pick which one should place first
        char smallestVow='u',smallestCons='z';
        
        for(int i=0; i<N; i++){
            char c = S.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){ arr1[c-'a']++; vowels++;
                if(c<smallestVow){
                    smallestVow=c;
                }
             }
            else{ arr2[c-'a']++; consnt++; 
                if(c<smallestCons){
                    smallestCons=c;
                }
            }
            
        }
        
        if(Math.abs(vowels-consnt)>1){ return "-1"; }
        
        boolean vowFir= true;
        
        if(vowels==consnt){
            if(smallestVow<smallestCons){
                vowFir=true;
            }
            else{
                vowFir=false;
            }
        }
        else if(vowels>consnt){ vowFir=true;}
        else{
            vowFir=false;}
        
        
        StringBuilder str = new StringBuilder();
        
        int i=0,j=0;
        
        while(i<26 && j<26){
            if(vowFir==true){
                //if the vowel is first
               // traversing through the array until we reach the first character
                while(i<26 && arr1[i]==0){ i++; }
                
                if(i<26){ 
                //appending the vowel to the string and decrementing the count of the vowel
                //in the array
                 str.append((char)(i+'a')); 
                 arr1[i]--; }
                
                //after appending the vowel...go for the first consonant
                
                while(j<26 && arr2[j]==0){ j++; }
                
                if(j<26){ 
                    str.append((char)(j+'a'));
                    arr2[j]--; }
            }
            else{
                //if the consonant is first
                //first traverse through  the consonant array ..and then vowel array.
                while(j<26 && arr2[j]==0){ j++; }
                if(j<26){
                    
                str.append((char)(j+'a')); 
                arr2[j]--; }
            
                while(i<26 && arr1[i]==0){ i++; }
                if(i<26){ 
                    str.append((char)(i+'a'));
                    arr1[i]--; }
            }
        }
        
        return str.toString();
    }
    }
