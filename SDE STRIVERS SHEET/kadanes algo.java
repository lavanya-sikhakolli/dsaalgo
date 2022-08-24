//also called as max. subarray sum
public static void maxSubarraySum(int []arr,int n){
  int sum=0,res=arr[0];
  for(int i=0;i<n;i++){
    sum+=arr[i];
    if(sum>res){res=sum;}
    if(sum<0){sum=0;}
  }
  return res;
}
