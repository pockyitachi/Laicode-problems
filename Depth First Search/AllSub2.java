package com.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllSub2 {
    public List<String> subSets2(String set) {
        // Write your solution here.
        List<String> res = new ArrayList<>();
        if(set == null){
            return res;
        }
        StringBuilder sb = new StringBuilder();
        char[] array = set.toCharArray();
        Arrays.sort(array);
        helper(array, sb, 0, res);
        return res;
    }
    private void helper(char[] array, StringBuilder sb, int index, List<String> res){
        if(index == array.length){
            res.add(sb.toString());
            return;
        }
        helper(array, sb.append(array[index]), index + 1, res);
        sb.deleteCharAt(sb.length() - 1);
        while(index < array.length - 1 && array[index] == array[index + 1]){
            index++;
        }
        helper(array, sb, index + 1, res);
    }
}
