package com.dynamicProgramming;

import java.util.HashSet;
import java.util.Set;

public class DictWord {
    public boolean canBreak(String input, String[] dict){
        Set<String> dictSet = toSet(dict);
        boolean[] canBreak = new boolean[input.length() + 1];
        canBreak[0] = true;
        for(int i = 0; i < canBreak.length; i++){
            for(int j = 0; j < i; j++){
                if(dictSet.contains(input.substring(j, i)) && canBreak[j]){
                    canBreak[i] = true;
                    break;
                }
            }
        }
        return canBreak[canBreak.length - 1];
    }
    private Set<String> toSet(String[] dict){
        Set<String> set = new HashSet<>();
        for(String s : dict){
            set.add(s);
        }
        return set;
    }
}
