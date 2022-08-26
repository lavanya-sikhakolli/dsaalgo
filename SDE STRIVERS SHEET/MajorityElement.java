public static int findMajority(int[] arr, int n) {
		// Write your code here.
        int count=0,res=-1;
        for(int i=0;i<n;i++){
            if(count==0){
                res=arr[i];
            }
            if(arr[i]==res){
                count++;
            }
            else{ count--;}
            
        }
        count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==res){
                count++;
            }
        }
        if(count>n/2){
            return res;
        }
        return -1;
	}
}



// return all majority elements whose count is greater than n/3........
 public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        int n=arr.size();
        ArrayList<Integer> res=new ArrayList<Integer>();
        int count1=0,count2=0,res1=-1,res2=-1;
        for(int i=0;i<n;i++){
            if(arr.get(i)==res1){
                count1++;
            }
            else if(arr.get(i)==res2){
                count2++;
            }
            else if(count1==0){
                res1=arr.get(i);
                count1=1;
            }
            else if(count2==0){
                res2=arr.get(i);
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;count2=0;
       
        for(int i=0;i<n;i++){
            if(arr.get(i)==res1){
                count1++;
            }
            if(arr.get(i)==res2){
                count2++;
            }
        }
            if(count1>n/3){
                res.add(res1);
            }
            if(count2>n/3){
                res.add(res2);
            }
      
        return res;
    }
