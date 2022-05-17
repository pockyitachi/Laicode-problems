package com.dfs;

public class ABXC {
    private void dfs(String input, StringBuilder curr, int idx) {
        if (idx == input.length()) {
            System.out.println(curr);
            return ;
        }
        // without x
        curr.append(input.charAt(idx));
        dfs(input, curr, idx + 1);
        curr.deleteCharAt(curr.length() - 1);

        // with x
        if (curr.length() <= 0) return ;
        curr.append('x');
        curr.append(input.charAt(idx));
        dfs(input, curr, idx + 1);
        curr.deleteCharAt(curr.length() - 1);
        curr.deleteCharAt(curr.length() - 1);
    }

    public static void main(String[] args) {
        String t1 = "ABC";
        String t2 = "A";
        String t3 = "";
        ABXC sol = new ABXC();
        /*
         *  ABC
            ABxC
            AxBC
            AxBxC
         */
        sol.dfs(t1, new StringBuilder(), 0);
        //sol.dfs(t2, new StringBuilder(), 0); // A
        //sol.dfs(t3, new StringBuilder(), 0); // ""
    }

}
