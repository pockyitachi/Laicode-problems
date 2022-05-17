package com.linkedlist;

public class Delete {
    public ListNode deleteNode(ListNode head, int index) {
        // Write your solution here
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        int i = -1;
        while(i < index - 1){
            cur = cur.next;
            i++;
        }
        if(i == index - 1){
            cur.next = cur.next.next;

        }
        return dummy.next;
    }
}
