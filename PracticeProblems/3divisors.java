//By using the sieve of Eratosthenes

class Solution{
    static ArrayList<Integer> threeDivisors(ArrayList<Long> query, int q){
        // code here
        ArrayList<Integer> res = new ArrayList<>();

        long max = 0;

        for(int i=0;i<q;i++){
            //finding the max among all querie values
            max = Math.max(max,query.get(i));

        }
        //loop runs till the square root value
        long nmax = (long)Math.sqrt(max); //nmax means new maximum
        //by taking n+1...each index represents ...whether the current value is prime or not
        boolean arr[] = new boolean[(int)nmax+1];
        //initially considering all are primes
        Arrays.fill(arr,true);
       //loop starts from 2...until the squareroot
        for(int i=2;i<=nmax;i++){
         //if the value is prime...making the multiples of primes as non prime
            if(arr[i]){

                for(int j=2;j*i<=nmax;j++){
                //making the multiples as false....since the number is not a prime
                    arr[j*i] = false;
                }
            }
        }
        int sum = 0;
      //by using sum variable...we are storing the required values count till that range

        int ans[] = new int[arr.length];

        for(int i=2;i<arr.length;i++){

            if(arr[i]){

                sum++;

            }
           //if arr[i] is not prime ...sum remains same
            ans[i] = sum;

        }

        for(int i=0;i<query.size();i++){
          res.add((int)ans[(int)Math.sqrt(query.get(i))]);
        }

        return res;

    }

}
