package com.dfs;

import java.util.ArrayList;
import java.util.List;

public class AllPermutation {
    public List<String> permutations(String input) {
        List<String> res = new ArrayList<String>();
        if(input == null){
            return res;
        }
        char [] array = input.toCharArray();
        helper(array, 0, res);
        return res;
    }

    private void helper(char[] array, int index, List<String> res){
        if(index == array.length){
            res.add(new String(array));
            return;
        }
        for(int i = index; i < array.length; i++){
            swap(array, index, i);
            helper(array, index + 1, res);
            swap(array, index, i);
        }
    }
    private void swap (char[] array, int left, int right){
        char temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

}
