int celebrity(int[][] M, int n) 
    {
        int a = 0;
        int b = n-1;
        
        while(a<b){
            if(M[a][b]==1) a++;    //if a knows b then a cannot be celebrity
            else        b--;    //if a doesn't know b then b cannot be celebrity
        }
        //while loop breaks when a==b 
        //a can be celebrity but we have to confirm....to check whether a is celeb or not 
        
        for(int i=0; i<n; i++){
            //if a knows any person i or any person i doesn't know a then
            //there is no celebrity return -1
            if(i!=a && (M[a][i]==1 || M[i][a]==0)){
                return -1;
            }
        }
        //if a passes above check then a is the required celebrity
        return a;
    }
