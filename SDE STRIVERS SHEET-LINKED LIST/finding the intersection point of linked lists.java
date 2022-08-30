public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int count1=0;
        ListNode a=headA;
        ListNode b=headB;
      while(a!=null){
          count1++;
        a=a.next;
      }
        int count2=0;
        while(b!=null){
            count2++;
            b=b.next;
        }
        a=headA;
        b=headB;
       
        int n=Math.abs(count1-count2);
        if(count1>=count2){
          for(int i=0;i<n;i++){
              a=a.next;
          }
        }
        else{
          for(int i=0;i<n;i++){
              b=b.next;
          }
        }
       while(a!=null && b!=null){
           if(a==b){
               return a;
           }
           a=a.next;
           b=b.next;
       }
        return null;
    }
}
