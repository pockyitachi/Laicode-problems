package com.linkedlist;

public class Print {
    public static void printLinkedList(ListNode head){
        ListNode cur = head;
        while(cur != null){
            System.out.print(cur.value);
            System.out.print(' ');
            cur = cur.next;
        }
    }
}
