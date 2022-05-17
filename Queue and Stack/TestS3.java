package com.queueAndStack;

import com.queueAndStack.Sort3Stack;

import java.util.LinkedList;

public class TestS3 {
    public static void main(String[] args) {
        LinkedList<Integer> sb = new LinkedList<>();
        sb.add(3);
        sb.add(1);
        sb.add(5);
        sb.add(4);
        sb.add(6);
        sb.add(8);
        sb.add(2);
        sb.add(7);
        Sort3Stack test = new Sort3Stack();
        test.sort(sb);
        System.out.println(sb);
    }
}
