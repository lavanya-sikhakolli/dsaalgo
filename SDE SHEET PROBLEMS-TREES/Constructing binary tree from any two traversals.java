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

//cONSTRUCTING BINARY TREE FROM INORDER AND POSTORDER TRAVERSALS
//since postorder traversal is....left root right....we are traversing from the end...therefore we will get root and then we will get right and then left.
//Since we are updating postIndex in every call ...we are defining it as a class variable
class Temp{
    int t=0;
}
class Solution {
    int postIndex=0;
    
    public TreeNode cT(int[] in,int[] post,int is,int ie,Temp postIndex){
        if(is>ie){ return null;}
        
        TreeNode root=new TreeNode(post[postIndex.t--]);
        int inIndex=0;
        for(int i=is;i<=ie;i++){
            if(in[i]==root.val){
                inIndex=i;
                break;
            }
        }
        root.right=cT(in,post,inIndex+1,ie,postIndex);
        root.left=cT(in,post,is,inIndex-1,postIndex);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n=inorder.length;
        if(n==0){
            return null;
        }
        if(n==1){
            TreeNode root=new TreeNode(inorder[0]);
            return root;
        }
         Temp temp=new Temp();
        temp.t=n-1;
        
        TreeNode res=cT(inorder,postorder,0,n-1,temp);
        return res;
    }
}
