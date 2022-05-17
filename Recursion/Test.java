package com.recursion;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        char[] array = {'A', 'B', 'C', 'D', '1', '2', '3', '4','5'};
        Reorder test = new Reorder();
        char[] res = test.reorder(array);
        System.out.println(Arrays.toString(res));
    }
}
