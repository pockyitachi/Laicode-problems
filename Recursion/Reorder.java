package com.recursion;

public class Reorder {
    public char[] reorder(char[] array) {
        if(array.length % 2 == 0){
            reorder(array, 0, array.length - 1);
        }else{
            reorder(array, 0, array.length - 2);
        }
        return array;
    }
    private void reorder(char [] array, int left, int right){
        int len = right - left + 1;
        if(len <= 2){
            return;
        }
        int mid = left + len / 2;
        int leftMid = left + len / 4;
        int rightMid = left + len * 3 / 4;
        reverse(array, leftMid, mid - 1);   //mid 是下个区间的起点
        reverse(array, mid, rightMid - 1);
        reverse(array, leftMid, rightMid - 1);

        reorder(array, left, left + (leftMid - left) * 2 - 1);
        reorder(array, left + (leftMid - left) * 2, right);

    }
    private void reverse(char [] array, int left, int right){
        while(left < right){
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}
