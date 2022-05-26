package com.heap;

public class TestKthSmall {
    public static void main(String[] args) {
        int[] A = {1,3,5};
        int[] B = {4,8};
        int k = 2;
        kthSmallest test = new kthSmallest();
        int res = test.kthSmallSum(A, B, k);
        System.out.println(res);
    }
}
