package leetcode;

public class AddTwoNumber {
    public ListNode addtwo(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // 答案白紙
        ListNode curr = dummyHead; // 當下位置
        int carry = 0; // 紀錄進位

        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.value : 0;
            int y = (l2 != null) ? l2.value : 0;
            int sum = x + y + carry; // x+y+要記得加上進位值

            carry = sum / 10; // 計算進位值

            curr.next = new ListNode(sum % 10); // 填答案

            curr = curr.next; // 換下一列

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return dummyHead.next;
    }
}
