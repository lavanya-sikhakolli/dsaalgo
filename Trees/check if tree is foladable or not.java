class Tree
{
    //Function to check whether a binary tree is foldable or not.
    boolean checkSubtrees(Node node1,Node node2){
        if(node1==null && node2==null){
            return true;
        }
        if(node1==null || node2==null){
            return false;
        }
        return (checkSubtrees(node1.left,node2.right)&&checkSubtrees(node1.right,node2.left));
    }
    
    boolean IsFoldable(Node node) 
	{ 
		// your code 
		if(node==null){ return true;}
		return checkSubtrees(node.left,node.right);
	    
	    
	} 
}
