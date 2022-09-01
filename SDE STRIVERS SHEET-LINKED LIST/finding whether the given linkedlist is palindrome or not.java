class Solution {
    public ListNode reverseList(ListNode head1){
        ListNode prev=null;
        while(head1!=null){
            ListNode curr=head1.next;
            head1.next=prev;
            prev=head1;
            head1=curr;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return true;
        }
        if(head.next==null){ return true;}
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2=reverseList(slow.next);
        slow.next=head2;
        slow=slow.next;
        ListNode curr=head;
        while(slow!=null){
            if(slow.val!=curr.val){
                return false;
            }
            slow=slow.next;
            curr=curr.next;
        }
        return true;
    }
}
