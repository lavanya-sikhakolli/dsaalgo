class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n=nums.length;
        if(n==1){
            return 0;
        }
     int sum=0,leftSum=0,rightSum=0;
     for(int i=0;i<n;i++){
         sum+=nums[i];
     }
        int res=0;
     long min=Integer.MAX_VALUE;
        long diff=0;
        int rightAvg=0,leftAvg=0;
     for(int i=0;i<n;i++){
         leftSum+=nums[i];
         rightSum=sum-leftSum;
         
         int temp=n-i-1;
         
         if(temp==0){
             diff=leftSum/(i+1);
         }
         else{
            diff=Math.abs(leftSum/(i+1)-(rightSum/temp));
         }
         
    if(diff<min){
             min=diff;
             res=i;
         }
     }
        return res;
    }
}
