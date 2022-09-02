class Solution {
    public ListNode reverse(ListNode h,int k){
        ListNode curr1=h;
        ListNode prev=null;
        for(int i=1;i<=k;i++){
            ListNode temp=curr1.next;
            curr1.next=prev;
            prev=curr1;
            curr1=temp;
            
        }
        return prev;
    }
    public ListNode rotateRight(ListNode head, int k) {
        ListNode curr=head;
        if(head==null){ return null;}
        int n=0;
         while(curr!=null){
            n++;
            curr=curr.next;
        }
        int K=k%n;
       curr=head;
        int count=0;
        ListNode b=null; 
        while(curr!=null){
            count++;
            if(count==n-K+1){
                b=curr;
                break;
            }
            curr=curr.next;
        }
        ListNode tail=head;
        ListNode head1=reverse(head,n-K);
        ListNode head2=reverse(b,K);
        tail.next=head2;
        ListNode newNode=reverse(head1,n);
        return newNode;
    }
}
