//finding the prime numbers in a range
void func(int n){
  //n+1 because for index2...we are storing whether 2 is prime or not
  boolean prime[]=new boolean[n+1];
  //Intially we are considering everything is prime
  for(int i=0;i<=n;i++)
  {  prime[i]=true; }
  //for less complexity....we will consider for square root of n....i.e...p square=n...=>p=sqrt(n)
  for(int p=2;p*p<=n;p++){
    //if the p is prime...then we are making the multiples of p as non prime
    if(prime[p]==true){
      for(int i=p*p;i<=n;i+=p){
        prime[i]=false;}
    }
  }
  //after the loops ...only the prime numbers will remain true
  for(int i=2;i<=n;i++){
    if(prime[i]==true){
      System.out.print(i+"  ");
    }
  }
