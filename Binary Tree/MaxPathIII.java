package com.tree;

// Sub-path root to any leave node
class MaxPathIII {
    private int res = Integer.MIN_VALUE;
    public int maxPathSumIII(TreeNode root) {
        helper(root);
        return res;
    }
    private int helper(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftSum = Math.max(helper(root.left), 0);
        int rightSum = Math.max(helper(root.right), 0);
        int sum = Math.max(leftSum, rightSum) + root.key;
        res = Math.max(res, sum);
        return sum;
    }
}
