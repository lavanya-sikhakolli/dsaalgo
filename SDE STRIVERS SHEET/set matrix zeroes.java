//.......Better Approach.........
import java.util.* ;
import java.io.*; 
public class Solution {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
         int rows = matrix.length, cols = matrix[0].length;
        int arr1[]=new int[rows];
        int arr2[]=new int[cols];
        Arrays.fill(arr1,-1);
        Arrays.fill(arr2,-1);
       // int res[][]=new int[rows][cols];
       // Arrays.fill(res,-1);
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==0){
                   arr1[i]=0;
                    arr2[j]=0;}
        }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr1[i]==0||arr2[j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        }
    }




//........optimised better approach.......
 int rows = matrix.length, cols = matrix[0].length;
        int col0=1;
        for(int i=0;i<rows;i++){
            if(matrix[i][0]==0){ col0=0;}
            for(int j=1;j<cols;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
       for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(matrix[i][0]==0||matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
       if(matrix[0][0]==0){
            for(int i=0;i<cols;i++){
                matrix[0][i]=0;
            }
        }
        if(col0==0){
        for(int i=0;i<rows;i++){
           matrix[i][0]=0; 
        }
        }
        }
    }
