//from preorder...we will get the inorder by sorting the preorder array ...since it is bst
class Solution {
    int preIdx=0;
    public TreeNode bst(int []pre,int []in,int is,int ie){
        if(is>ie){ return null;}
        TreeNode root=new TreeNode(pre[preIdx++]);
        int inIdx=0;
        for(int i=is;i<=ie;i++){
            if(in[i]==root.val){
                inIdx=i;
                break;
            }
        }
        root.left=bst(pre,in,is,inIdx-1);
        root.right=bst(pre,in,inIdx+1,ie);
        return root;
        
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        int n=preorder.length;
        int inorder[]=new int[n];
        for(int i=0;i<n;i++){
            inorder[i]=preorder[i];
        }
        Arrays.sort(inorder);
        TreeNode root=bst(preorder,inorder,0,n-1);
        return root;
    }
}
