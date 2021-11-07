package practice;
/*You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.*/

public class Main {

    public static void main(String[] args) {
        ListNode one = new ListNode(2, new ListNode(4, new ListNode(3)) );
        ListNode two = new ListNode(5, new ListNode(6, new ListNode(4)) );
        Solution s1 = new Solution();
        ListNode result = s1.addTwoNumbers(one, two);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
