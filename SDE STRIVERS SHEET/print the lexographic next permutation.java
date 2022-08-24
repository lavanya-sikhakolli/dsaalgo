public static array nextPermutation(int A[]){
  int n=A.length;
  if(n<=1){ return A;}
  int i=n-2;
  while(i>=0 && A[i]>=A[i+1]){i--;}
  if(i>=0){
    int j=n-1;
    while(A[i]>=A[j]){j--;}
    swap(A,i,j);
  }
  reverse(A,i+1,n-1);
  public static void swap(int A[],int i,int j){
    int temp=A[i];
    A[i]=A[j];
    A[j]=temp;}
  public static void reverse(int A[],int i,int j){
    while(i<j){ swap(A,i++,j--);}
  }
