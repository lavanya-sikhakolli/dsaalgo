class Solution
{
    Node pre=null;
    Node node=null;
    Node head=null;
    //Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root)
    {
	//  Your code here	
	if(root==null){ return root;}
	 node=bToDLL(root.left);
	if(pre==null){
	    head=root;
	}
	else{
	    pre.right=root;
	    root.left=pre;
	}
	pre=root;
	bToDLL(root.right);
	return head;
    }
}
