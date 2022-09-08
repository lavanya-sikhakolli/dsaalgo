class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        int res[]=new int[2];
        Arrays.sort(arr,(a,b)->(b.profit-a.profit));
        int maxi=0;
        for(int i=0;i<n;i++){
            if(arr[i].deadline>maxi){
                maxi=arr[i].deadline;
            }
        }
        int result[]=new int[maxi+1];
        Arrays.fill(result,-1);
        int countjobs=0,profit=0;
        for(int i=0;i<n;i++){
            for(int j=arr[i].deadline;j>0;j--){
                if(result[j]==-1){
                    countjobs++;
                    profit+=arr[i].profit;
                    result[j]=i;
                    break;
                }
            }
        }
        res[0]=countjobs;
        res[1]=profit;
        return res;
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/
