package com.finalExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubstringFinding {
    public static List<Integer> substringFinding(String small, String large) {
        List<Integer> res = new ArrayList<>();
        if(large.length() < small.length()) {
            return res;
        }
        for(int i = 0; i <= large.length() - small.length(); i++) {
            if(equals(large, i, small)) {
                res.add (i);
            }
        }
        return res;
    }
    public static boolean equals(String large, int start, String small) {
        for(int i = 0; i < small.length(); i++) {
            if(large.charAt(i + start) != small.charAt(i)) {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        String small = "ab";
        String large = "bcabcab";
        System.out.println(substringFinding(small, large));
    }
}
