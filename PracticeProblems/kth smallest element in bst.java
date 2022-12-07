class Solution {
    // Return the Kth smallest element in the given BST
    int ans=-1;
    int cnt=0;
    public void kthSmallest(Node root,int k){
        if(root!=null){
            kthSmallest(root.left,k);
            cnt++;
            if(cnt==k){
                ans=root.data;
                return;
            }
            kthSmallest(root.right,k);
        }
    }
    public int KthSmallestElement(Node root, int K) {
        // Write your code here
        kthSmallest(root,K);
        return ans;
    }
}
