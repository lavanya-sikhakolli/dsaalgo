class NodeValue{
    int max_val,min_val,size;
    boolean isBst;
    NodeValue(boolean isBst,int min_val,int max_val,int size){
        this.isBst=isBst;
        this.max_val=max_val;
        this.min_val=min_val;
        this.size=size;
    }
}

//since we are updating the value dynamically ,we are creating class variable
class Res{
      int res=0;
    Res(){
        }
}
class Solution{
    
    static NodeValue func(Node root,Res obj ){
        //an empty tree is a bst of size 0
        if(root==null){ return new NodeValue(true,Integer.MAX_VALUE,Integer.MIN_VALUE,0);}
        //we are following the postorder traversal
      
        NodeValue left=func(root.left,obj);
        NodeValue right=func(root.right,obj);
        
         NodeValue curr=new NodeValue(false,Integer.MAX_VALUE,Integer.MIN_VALUE,0);
         //if the four conditions satisfy....then the curr will be the bst
        if(left.isBst==true && right.isBst==true && left.max_val<root.data && right.min_val>root.data){
           curr.isBst=true;
            
        }
        //if not...curr is not a bst
        else{ curr.isBst=false;}
        //and the max val and min values are updating by comparing the left and right max values
        //with curr value which is root value
        //same with min value
        curr.max_val=Math.max(Math.max(left.max_val,right.max_val),root.data);
        curr.min_val=Math.min(Math.min(left.min_val,right.min_val),root.data);
        //update the curr size
        curr.size=left.size+right.size+1;
        //ans will be updated only if the curr.isBst is true
        if(curr.isBst==true){
            obj.res=Math.max(obj.res,curr.size);
        }
        return curr;
    }
    
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root)
    {
        // Write your code here
        Res result=new Res();
         func(root,result);
        return result.res;
        
    }
    
}
