public static int max(int arr[],int n){
  int minPrice=Integer.MAX_VALUE;
  int maxPro=0;
  for(int i=0;i<n;i++){
    minPrice=Math.min(minPrice,arr[i]);
    maxPro=Math.max(maxPro,arr[i]-minPrice);
  }
  return maxPro;
}
