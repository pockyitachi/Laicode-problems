package com.heap;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int [] array = {2,3,4,0};
        int ele =  1;
        array[2] = ele;
        heapOffer minHeap = new heapOffer();
        int[] res = minHeap.offerHeap(array, ele);
        System.out.println(Arrays.toString(res));

    }
}
