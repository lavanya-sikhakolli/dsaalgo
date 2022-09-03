//ip: 1->2->3->4->5->6->7->8,   k=3
//op: 3->2->1->6->5->4->7->8

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int n=0;
        ListNode curr=head;
        while(curr!=null){
            n++;
            curr=curr.next;
        }
        boolean isFirst=true;
       curr=head;
        ListNode prevFirst=null;
        while(curr!=null && n>=k){
            ListNode first=curr,prev=null;
            int count=0;
            while(curr!=null && count<k){
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
                count++;
                
            }
            n-=k;
            if(isFirst==true){
                head=prev;
                isFirst=false;
            }
            else{
                prevFirst.next=prev;
            }
            prevFirst=first;
        }
        prevFirst.next=curr;
        return head;
    }
}
