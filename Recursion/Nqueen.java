package com.recursion;

import java.util.*;

public class Nqueen {
    public List<List<Integer>> nqueens(int n) {
        // Write your solution here
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<Integer>();
        helper(n, cur, res);
        return res;
    }
    private void helper(int n, List<Integer> cur, List<List<Integer>> res){
        //base case
        if(cur.size() == n){
            res.add(new ArrayList<Integer>(cur));
            return;
        }
        for(int i = 0; i < n; i++){ //控制行
            if(valid(cur, i)){
                cur.add(i);
                helper(n, cur, res);
                cur.remove(cur.size() - 1);
            }
        }
    }
    private boolean valid(List<Integer> cur, int column){
        int row = cur.size(); // 用cur的index 来代表行， 值代表列
        for(int i = 0; i < row; i++){
            if(cur.get(i) == column || Math.abs(cur.get(i) - column) == row - i){
                return false;
            }
        }
        return true;
    }

}
