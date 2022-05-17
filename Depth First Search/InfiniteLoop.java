package com.finalExam;

public class InfiniteLoop {
    public boolean canLoop(String[] array){
        if(array == null){
            return false;
        }
        return helper(array, 1);
    }
    private boolean helper(String[] array, int index){
        if(index == array.length){
            return checker(array[index - 1], array[0]);
        }
        for(int i = index; i < array.length; i++){
            if(checker(array[index - 1], array[i])){
                swap(array, index, i);
                if(helper(array, index + 1)){
                    return true;
                }
                swap(array, index, i);
            }
        }
        return false;
    }
    private boolean checker(String a, String b){
        return a.charAt(a.length() - 1) == b.charAt(0);
    }
    private void swap(String[] array, int left, int right){
        String temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}