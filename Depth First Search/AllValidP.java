package com.dfs;

import java.util.ArrayList;
import java.util.List;

public class AllValidP {
    public List<String> validParentheses(int n) {
        List<String> res = new ArrayList<>();
        if(n <= 0){
            return res;
        }
        char [] cur = new char[n * 2];
        helper(cur, n, n, 0, res);
        return res;
    }
    private void helper(char[] cur, int left, int right, int index, List<String> res){
        if(left == 0 && right == 0){
            res.add(new String(cur));
            return;
        }
        if(left > 0){
            cur[index] = '(';
            helper(cur, left - 1, right, index + 1, res);
        }
        if(right > left){
            cur[index] = ')';
            helper(cur, left, right - 1, index + 1, res);
        }
    }
}
// 每个括号有两个操作 一共2n个括号 TC： O(2^2n) SC O(n)
