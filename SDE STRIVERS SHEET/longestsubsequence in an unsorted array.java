//input...[8,5,2,6,1,7,4]....output...5
public static int longestsequence(int arr[],int n){
  int longestSequence=0,currNum=0,currSequence=0;
  Set<Integer> hashSet=new HashSet<Integer>();
  for(int i=0;i<n;i++){
    hashSet.add(arr[i]);}
  for(int i=0;i<n;i++){
    if(!hashSet.contains(arr[i]-1)){
      currNum=arr[i];
      currSequence=1;
      while(hashSet.contains(currNum+1)){
        currNum+=1;
        currSequence+=1;}
    }
      longestSequence=Math.max(currSequence,longestSequence);
    }
  return longestSequence;
}
