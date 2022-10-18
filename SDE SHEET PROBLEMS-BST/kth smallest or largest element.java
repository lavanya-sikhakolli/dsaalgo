//By following inorder traversal 
//finding the kth smallest value
class Solution {
    int count=0;
    int res=0;
    public int kthSmallest(TreeNode root, int k) {
        if(root!=null){
          //from the smallest element,comparing the count with k...
        kthSmallest(root.left,k);
        count++;
        if(count==k){
            res= root.val;
            return res;
        }
        kthSmallest(root.right,k);
        }
        return res;
    }
}

//By following reverse inorder traversal....Right Root Left
//finding the kth largest value
class Solution
{
    int count=0;
    int res=0;
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K)
    {
        //Your code here
        if(root!=null){
          //by following the reverse inorder traversal
          //calling the right subtree first
            kthLargest(root.right,K);
            count++;
            if(count==K){
                res=root.data;
                return res;
            }
          //
            kthLargest(root.left,K);
        }
        return res;
    }
}
