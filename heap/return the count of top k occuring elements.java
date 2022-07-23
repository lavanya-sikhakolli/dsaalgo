int kMostFrequent(int arr[], int n, int k){
        // your code here
           Map<Integer, Integer> map = new HashMap<>();
       for (int a: arr) {
           map.put(a, map.getOrDefault(a, 0) + 1);//we are adding the values with their respective frequencies in to the map.
       }
       PriorityQueue<Integer> pq = new PriorityQueue<>();
       int i =0;
       for (int fre : map.values()) {//...since we only need the count....by constructing the min heap....we are placing the max .frequencies in the heap(k values)
           if (pq.size() < k) pq.add(fre);
           else if (pq.peek()<fre) {
                 pq.poll();
                 pq.add(fre);
           }
       }
       return pq.stream().reduce(0, (x,y) -> x+y);//returning the sum of the k values present in heap.
