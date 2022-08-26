public double myPow(double x, int n) {
        double ans=1.0;
        boolean flag=true;
        long nn=(long)n;
        if(nn<0){
            nn=-nn;
            flag=false;}
      while(nn>0){
          if(nn%2==1){
              ans=ans*x;
              nn=nn-1;
          }
          else{
              x=x*x;
              nn=nn/2;
          }
      }
       if(flag==false){ return 1/ans;}
        return ans;
    }
