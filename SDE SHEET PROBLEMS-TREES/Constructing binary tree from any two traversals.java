//CONSTRUCTING BINARY TREE BY USING INORDER AND PREORDER TRAVERSAL

class Solution {
    int preIndex=0;
    public TreeNode cT(int []preorder,int []inorder,int is,int ie){
        if(is>ie){ return null;}
        TreeNode root=new TreeNode(preorder[preIndex++]);
        int inIndex=0;
        for(int i=is;i<=ie;i++){
            if(inorder[i]==root.val){
                inIndex=i;
                break;
            }
        }
        root.left=cT(preorder,inorder,is,inIndex-1);
        root.right=cT(preorder,inorder,inIndex+1,ie);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
        if(n==0 ){
            return null;
        }
        if(n==1){
        TreeNode node=new TreeNode(preorder[0]);
            return node;
        }
        TreeNode res=cT(preorder,inorder,0,n-1);
        return res;
    }
}
