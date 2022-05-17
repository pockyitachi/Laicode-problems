package com.recursion;

import java.util.*;

public class TestNq {
    public static void main(String[] args) {
        Nqueen test = new Nqueen();
        List<List<Integer>> res = test.nqueens(4);
        System.out.println(Arrays.toString(res.toArray()));
    }
}
