package leetcode;

public class LinkedListReverse {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return  prev;
    }
}

class ListNode{
    int value;
    ListNode next;

    public ListNode(int value){
        this.value = value;
    }
}
