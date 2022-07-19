class Tree
{
    //Function to count number of subtrees having sum equal to given sum
    int c=0;
    int method(Node root,int X){
        if(root==null){ return 0;}//finding whether in between subtrees sum is equal to given sum .......
      int l=  method(root.left,X);
      int r=  method(root.right,X);
        if(l+r+root.data==X){ c=c+1;}
    return l+r+root.data;
    }
    int countSubtreesWithSumX(Node root, int X)
    {
	    int ls=  method(root.left,X);//left sum returning to root
	    int rs=method(root.right,X);//right sum returning to root
	    if(ls+rs+root.data==X){ 
	      c=c+1;}
	 return c;
    }
}

