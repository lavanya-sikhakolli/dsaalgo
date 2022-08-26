//if the matrix is a 2d array
public static boolean search(int [][]matrix,int m,int n,int target){
  //accessing the 2d mat as 1d ...since the elements are non-decreasing order row wise 
  int low=0,high=m*n-1;
  while(low<=high){
    int mid=low+(high-low)/2;
    if(matrix[mid/m][mid%m]==target){return true;}
    else if(matrix[mid/m][mid%m]<target){low=mid+1;}
    else{high=mid-1}
  }
  return false;
}
  
  
  //if the matrix is of collections
  public static boolean search(ArrayList<ArrayList<Integer> matrix,int m,int n,int target){
    int low=0,high=n-1;
    while(low<m &&high>=0){
      if(matrix.get(low).get(high)==target){return true;}
      else if(matrix.get(low).get(high)<target){low++;}
      else{high--}
    }
    return false;
  }
