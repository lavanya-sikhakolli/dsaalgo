class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        while(q.isEmpty()==false){
            int count=q.size();
            List<Integer> res1=new ArrayList<>();
            for(int i=0;i<count;i++){
            TreeNode curr=q.poll();
                res1.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            res.add(res1);
        }
        return res;
    }
}
//Zig-Zag traversal
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> q=new LinkedList<>();
        Stack<Integer> s=new Stack<>();
        boolean flag=false;
        q.add(root);
        while(q.isEmpty()==false){
            int count=q.size();
            List<Integer> res1=new ArrayList<>();
            for(int i=0;i<count;i++){
                TreeNode curr=q.poll();
            if(flag==true){
               s.push(curr.val);
            }
         else{
                res1.add(curr.val);}
                 if(curr.left!=null){ q.add(curr.left);}
                 if(curr.right!=null){ q.add(curr.right);}
                
            }
                //res.add(res1);
            
            if(flag==true){
                while(s.isEmpty()==false){
                res1.add(s.pop());}
            }
                flag=!flag;
            res.add(res1);
         
        }
        return res;
    }
}
//VERTICAL TRAVERSAL OF A BINARY TREE BY SORTING THE ELEMENTS PRESENT AT THE SAME POSITION
class Tuple{
    TreeNode node;
    int row;
    int col;
    Tuple(TreeNode n,int r,int c){
        node=n;
        row=r;
        col=c;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        if(root==null){
            return res;
        }
        Queue<Tuple> q=new LinkedList<Tuple>();
        q.offer(new Tuple(root,0,0));
        while(q.isEmpty()==false){
            Tuple t=q.poll();
            TreeNode curr=t.node;
            int ro=t.row;
            int co=t.col;
            //here we are taking cols as key and value contains ...key as row and values as priority queue (in which elements are sorted by default)
            //if the column is not present in the map... add that in to map
            if(!(map.containsKey(co))){
                map.put(co,new TreeMap<> ());
            }
            //if the row is not present in the map....then add the map to the respective coloumns
            if(!map.get(co).containsKey(ro)){
                map.get(co).put(ro,new PriorityQueue<>());
            }
            //now ...add the data to the row and column
            map.get(co).get(ro).offer(curr.val);
            if(curr.left!=null){
                q.offer(new Tuple(curr.left,ro+1,co-1));
            }
            if(curr.right!=null){
                q.offer(new Tuple(curr.right,ro+1,co+1));
            }
        }
        //by considering only row and priority queue
         for (TreeMap < Integer, PriorityQueue < Integer >> ys: map.values()) {
            res.add(new ArrayList < > ());
             //by considering only priority queue
            for (PriorityQueue < Integer > nodes: ys.values()) {
                while (!nodes.isEmpty()) {
                    res.get(res.size() - 1).add(nodes.poll());
                }
            }
        }
        return res;   // (2,[(-2,{4}),(0,{5,6}),(2,{7})])
    }
}
//BOUNDARY TRAVERSAL OF A BINARY TREE
class Solution
{
     ArrayList<Integer> res=new ArrayList<>();
     boolean isLeaf(Node root){
        if(root.left==null && root.right==null){
            return true;
        }
        return false;
    }
      void addingLeft(Node root){
        Node curr=root.left;
        while(curr!=null){
            //adding only when it is not leaf node
            if(isLeaf(curr)==false){
                res.add(curr.data);
            }
            //if there is no left node...then the right node itself is the boundary node
            if(curr.left!=null){ curr=curr.left;}
            else { curr=curr.right;}
        }
    }
    void addingLeaves(Node root){
        //adding the leaf nodes
       if(isLeaf(root)==true){
           res.add(root.data);
           return;
       }
       //traversing until we reach the leaf nodes 
        if(root.left!=null){addingLeaves(root.left);}
        if(root.right!=null){
            addingLeaves(root.right);
        }
    }
    void addingRight(Node root){
        ArrayList<Integer> temp=new ArrayList<>();
        Node curr=root.right;
        while(curr!=null){
            if(isLeaf(curr)==false){temp.add(curr.data);}
            //if there is no right node...then left node will be the boundary
            if(curr.right!=null){curr=curr.right;}
            else{ curr=curr.left;}
        }
        for(int i=temp.size()-1;i>=0;i--){
            res.add(temp.get(i));
        }
    }
	ArrayList <Integer> boundary(Node node)
	{
	      if(node ==null){
            return res;
        }
        //if we wont check this condition then if the root is itself is the leaf....so the 
        //the data will be added twice which is by aading in the leaves method.
        if(isLeaf(node)==false){res.add(node.data);}
        addingLeft(node);
        addingLeaves(node);
        addingRight(node);
        return res;
	
	}
}
