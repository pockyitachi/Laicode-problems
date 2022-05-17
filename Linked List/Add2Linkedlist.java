package com.linkedlist;

public class Add2Linkedlist {
    public ListNode addTwoNumbers(ListNode one, ListNode two) {
        // Write your solution here
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int sum = 0;
        while (one != null || two != null || sum != 0) {
            if (one != null) {
                sum = sum + one.value;
                one = one.next;
            }
            if (two != null) {
                sum = sum + two.value;
                two = two.next;
            }
            cur.next = new ListNode(sum % 10);
            sum = sum / 10;
            cur = cur.next;
        }
        return dummy.next;
    }
}
