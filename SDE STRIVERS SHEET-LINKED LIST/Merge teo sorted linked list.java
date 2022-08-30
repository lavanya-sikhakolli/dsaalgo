class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode a=list1,b=list2,head=null,tail=null;
        if(a==null){ return b;}
        if(b==null){ return a;}
        if(a.val<=b.val){
            head=a;
            tail=a;
            a=a.next;
        }
        else{
            head=b;
            tail=b;
            b=b.next;
        }
        while(a!=null &&b!=null ){
            if(a.val<=b.val){
                tail.next=a;
                tail=a;
                a=a.next;
            }
            else{
                tail.next=b;
                tail=b;
                b=b.next;
            }
        }
        if(a==null){
            tail.next=b;
        }
        else{ tail.next=a;}
        return head;
    }
}
