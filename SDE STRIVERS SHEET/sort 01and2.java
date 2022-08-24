public static void sorting(int arr[],int n){
  int low=0,high=n-1,mid=0;
  while(mid<=high){
    if(arr[mid]==0){
      int temp=arr[low];
      arr[low]=arr[mid];
      arr[mid]=temp;
    low++;
    mid++;
    }
    else if(arr[mid]==1){mid++;}
    else {
      int temp=arr[high];
      arr[high]=arr[mid];
      arr[mid]=temp;
      high--;}
  }
