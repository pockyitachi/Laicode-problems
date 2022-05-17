package com.queueAndStack;

import java.util.Iterator;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.offerFirst(2);
        list.offerFirst(3);
        list.offerFirst(1);
        list.offerFirst(4);

        Sort twoStackSort = new Sort();
        twoStackSort.sortBy2Stack(list);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
