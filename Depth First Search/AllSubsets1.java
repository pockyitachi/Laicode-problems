package com.dfs;

import java.util.ArrayList;
import java.util.List;

public class AllSubsets1 {
    public List<String> subSets(String set) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        if(set == null){
            return res;
        }
        char [] array = set.toCharArray();
        helper(array, sb, 0, res);
        return res;
    }
    // 每层决定是否拿一个字母
    // 两个状态 拿 or 不拿
    // string.length（）层，e.g. abc 第一层 拿or不拿a 第二层b 第三次c 一共3层
    private void helper(char[] array, StringBuilder sb, int index, List<String> res){
        if(index == array.length){
            res.add(sb.toString());
            return;
        }
        //在每一层几个状态就有几个recursion call
        helper(array, sb, index + 1, res);    // 不pick当前层（当前index）所指的字母
        helper(array, sb.append(array[index]), index + 1, res); //pick 当前层（当前index）所指的字母
        sb.deleteCharAt(sb.length()-1);// 吃吐守恒，退回原状态
    }
}
