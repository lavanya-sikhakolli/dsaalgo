public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null){ return null;}
        ListNode slow=head;
        ListNode fast=head;
        ListNode a=head;
        while(fast!=null &&fast.next!=null){
             slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                while(slow!=a){
                    slow=slow.next;
                    a=a.next;
                }
                return slow;
            }
        }
        return null;
    }
}
