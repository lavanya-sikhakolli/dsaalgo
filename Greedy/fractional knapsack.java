class itemComparator implements Comparator<Item>{

    @Override
    public int compare(Item a,Item b){
        double r1=(double)a.value/(double)a.weight;
        double r2=(double)b.value/(double)b.weight;
        if(r1<r2){ return 1;}
        else if(r1>r2){ return -1;}
        else {return 0;}
    }
}

class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        Arrays.sort(arr,new itemComparator());
        double res=0.0;
        int currWeight=0;
        for(int i=0;i<arr.length;i++){
            if(currWeight+arr[i].weight<=W){
                currWeight+=arr[i].weight;
                res+=arr[i].value;
            }
            else{
                int remain=W-currWeight;
                res+=((double)arr[i].value/(double)arr[i].weight)*(double)remain;
                break;
            }
        }
        return res;
    }
}
