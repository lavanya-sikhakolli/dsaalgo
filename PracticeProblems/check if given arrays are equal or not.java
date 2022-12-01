//Using HashMap
class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        Map<Long,Integer> mp=new HashMap<>();
        for(long num:A){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        for(long num:B){
            mp.put(num,mp.getOrDefault(num,0)-1);
        }
        //By using Iterrator ...we are storing the values in i
       Collection getValues = mp.values();
       Iterator i = getValues.iterator();
       while (i.hasNext()) {
           //we are converting the object Integer type to int type(Unboxing)
       if((int)i.next()!=0){
           return false;
          }
        }
        return true;
    }
}
