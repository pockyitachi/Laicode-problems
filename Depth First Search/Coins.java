package com.dfs;

import java.util.ArrayList;
import java.util.List;

public class Coins {
    public List<List<Integer>> combinations(int target, int[] coins) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        helper(target, coins, 0, cur, res);
        return res;
    }
    private void helper(int target, int[] coins, int index, List<Integer> cur, List<List<Integer>> res){
        if(index == coins.length - 1){
            if(target % coins[coins.length - 1] == 0){
                cur.add(target / coins[coins.length - 1]);
                res.add(new ArrayList<Integer>(cur));
                cur.remove(cur.size() - 1);
            }
            return;
        }
        int max = target / coins[index];
        for(int i = 0; i <= max; i++){
            cur.add(i);
            int targetLeft = target - i * coins[index];
            helper(targetLeft, coins, index + 1, cur, res); //吃
            cur.remove(cur.size() - 1);   //吐
        }
    }

}
