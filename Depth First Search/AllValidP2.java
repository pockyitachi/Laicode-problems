package com.dfs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class AllValidP2 {
    private static final char[] brackets = new char[]{'(', ')', '<', '>', '{', '}'};
    public List<String> validParentheses(int l, int m, int n) {
        // Write your solution here
        int num = (l + m + n) * 2;
        List<String> res = new ArrayList<>();
        int [] remain = new int[]{l, l, m, m, n, n};
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        helper(brackets, remain, stack, res, sb, num);
        return res;
    }
    private void helper(char[] brackets, int[] remain, Deque<Character> stack, List<String> res, StringBuilder sb, int num){
        if(sb.length() == num){
            res.add(sb.toString());
            return;
        }
        for(int i = 0; i < remain.length; i++){
            // index 为单数时 都是右括号
            if(i % 2 == 0){
                //都是加左括号
                if(remain[i] > 0){
                    sb.append(brackets[i]);
                    remain[i]--;
                    stack.offerFirst(brackets[i]);
                    helper(brackets, remain, stack, res, sb, num);
                    sb.deleteCharAt(sb.length() - 1); //吐
                    remain[i]++;   //吐
                    stack.pollFirst();
                }
            }
            else{
                //都是加右括号
                //当前index - 1 与 上一轮的index对应的括号一样 -> 当前 index 的括号与 index-1 的括号配对
                if(!stack.isEmpty() && (stack.peekFirst() == brackets[i - 1])){
                    sb.append(brackets[i]);
                    stack.pollFirst();
                    remain[i]--;
                    helper(brackets, remain, stack, res, sb, num);
                    sb.deleteCharAt(sb.length() - 1);
                    stack.offerFirst(brackets[i - 1]);//吐
                    remain[i]++; //吐
                }
            }
        }
    }
}

