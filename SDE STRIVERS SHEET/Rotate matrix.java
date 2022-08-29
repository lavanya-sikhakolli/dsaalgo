//By observing ...we can get the rotation by transposing the matrix and then reversing each row

public void rotate(int[][] matrix) {
        int rows=matrix.length,cols=matrix[0].length;
        for(int i=0;i<rows;i++){
            for(int j=i;j<cols;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
       
        for(int i=0;i<rows;i++){
            int low=0,high=cols-1;
            while(low<high){
                int temp=matrix[i][low];
                matrix[i][low]=matrix[i][high];
                matrix[i][high]=temp;
                low++;
                high--;
            }
        }
