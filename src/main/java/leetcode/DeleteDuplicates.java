package leetcode;

public class DeleteDuplicates {
    public ListNode delete(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode curr = head;
        while (curr != null||curr.next != null) {
            if (curr.value == curr.next.value){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        return  head;
    }
}
