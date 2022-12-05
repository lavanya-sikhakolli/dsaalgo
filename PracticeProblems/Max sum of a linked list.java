class Solution {
    public ListNode reverse(ListNode head1){
        ListNode prev=null;
        ListNode curr=head1;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode slow=head,fast=head;
        int sum=0;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
       
        ListNode rev=reverse(slow.next);
        slow.next=rev;
        ListNode curr=head;
        while(rev!=null){
            int currSum=curr.val+rev.val;
            if(sum<currSum){
                sum=currSum;
            }
            curr=curr.next;
            rev=rev.next;
        }
        return sum;
    }
}
