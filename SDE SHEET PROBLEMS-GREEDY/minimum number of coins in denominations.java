public class Solution
{
public static int findMinimumCoins(int amount)
    {
        // Write your code here.
    int arr[]={1000,500,100,50,20,10,5,2,1};
    int count=0;
    for(int i=0;i<9;i++){
        while(amount>=arr[i]){
            amount-=arr[i];
            count++;
        }
    }
    return count;
    }
}
