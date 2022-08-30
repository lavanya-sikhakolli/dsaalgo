class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        if(head==null){ return head;}
        
        while(head!=null){
          ListNode  next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        
        return prev;
    }
}
