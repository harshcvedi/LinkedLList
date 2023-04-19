lass Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
        ListNode ahead=curr.next;//kyoki aage ki linked list ghum na ho
        curr.next=prev;
        prev=curr;
        curr=ahead;

     
    }
    return prev;
    }
   
}
