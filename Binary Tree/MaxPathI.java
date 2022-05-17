package com.tree;
//leave node to leave node
public class MaxPathI {
    private int res = Integer.MIN_VALUE;
    public int maxPathSumI(TreeNode root) {
        helper(root);
        return res;
    }
    private int helper(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftSum = helper(root.left);
        int rightSum = helper(root.right);
        if(root.left == null) {
            return rightSum + root.key;
        }else if (root.right == null){
            return leftSum + root.key;
        }else{
            int sum = leftSum + rightSum + root.key;
            res = Math.max(res, sum);
        }
        return Math.max(leftSum, rightSum) + root.key;
    }

}
