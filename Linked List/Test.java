package com.linkedlist;

import static com.linkedlist.Print.printLinkedList;

public class Test {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(9);
        ListNode n6 = new ListNode(6);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        ListNode c1 = new ListNode(1);
        ListNode c2 = new ListNode(1);
        ListNode c3 = new ListNode(1);
        ListNode c4 = new ListNode(1);
        ListNode c5 = new ListNode(1);
        ListNode c6 = new ListNode(1);
        c1.next = c2;
        c2.next = c3;
        c3.next = c4;
        c4.next = c5;
        c5.next = c6;
        // LinkedList print
        //printLinkedList(n1);
        //System.out.println(' ');

        //Methods
        //Delete deleteByIndex = new Delete();
        //ListNode res = deleteByIndex.deleteNode(n1, 3);
        //printLinkedList(res);

        //Add 2
        printLinkedList(n1);
        System.out.println(' ');
        printLinkedList(c1);
        System.out.println(' ');
        Add2Linkedlist add = new Add2Linkedlist();
        ListNode resAdd = add.addTwoNumbers(n1, c1);
        printLinkedList(resAdd);

    }
}
