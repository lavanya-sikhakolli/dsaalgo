/*class Item implements Comparable<Item>{
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
    public int compareTo(Item i){
        return (this.weight)*(i.value)-(this.value)*(i.weight);
    }
}*/

class itemComparator implements Comparator<Item>{

    @Override
    // to get the max value,here we are sorting based on the ratio of value/weight
    public int compare(Item a,Item b){
        double r1=(double)a.value/(double)a.weight;
        double r2=(double)b.value/(double)b.weight;
        //we need decreasing order
        if(r2>r1){ return 1;}
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
        //int currWeight=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].weight<=W){
                //considering the weights which are having less than the given weight
                W-=arr[i].weight;
                res+=arr[i].value;
            }
            else{
                //adding the remaining part
                res+=((double)arr[i].value/(double)arr[i].weight)*(double)W;
                break;
            }
        }
        return res;
    }
}
