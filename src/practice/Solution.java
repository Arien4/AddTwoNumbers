package practice;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode p = head;

        int reminder = 0;
        while (l1 != null || l2 != null || reminder != 0) {
            if (l1 != null) {
                reminder += l1.val;
                l1 = l1.next;

            }
            if (l2 != null) {
                reminder += l2.val;
                l2 = l2.next;

            }

            p.next = new ListNode(reminder % 10);
            p = p.next;
            reminder = reminder / 10;
            //System.out.println("reminder before next iteration: " + reminder);
        }
        return head.next;
    }
}
