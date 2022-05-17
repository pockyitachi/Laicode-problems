package com.heap;

public class heapOffer {
    public int[] offerHeap(int[] array, int ele) {
        // Write your solution here
        int len = array.length;
        array[len - 1] = ele;
        percolateUp(array, len - 1, ele);

        return array;
    }
    private void percolateUp(int[] array, int index, int ele){
        while(index > 0){
            int parentIndex = (index - 1)/2;
            if(array[parentIndex] > array[index]){
                swap(array, parentIndex, index);
            }else{
                break;
            }
            index = parentIndex;
        }
    }

    private void swap(int [] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}

