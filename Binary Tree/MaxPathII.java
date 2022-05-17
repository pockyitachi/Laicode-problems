package com.tree;
// Any Node to Any Node
public class MaxPathII {
    private int res = Integer.MIN_VALUE;
    public int maxPathSumII(TreeNode root) {
        helper(root);
        return res;
    }
    private int helper(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftSum = Math.max(helper(root.left), 0);
        int rightSum = Math.max(helper(root.right), 0);
        int sum = leftSum + rightSum + root.key;
        res = Math.max(res, sum);
        return Math.max(leftSum, rightSum) + root.key;
    }
}
