package com.tree;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, null);
        root.left = new TreeNode(2, root);
        root.right = new TreeNode(3,root);
        root.left.left = new TreeNode(4, root.left);
        root.left.right = new TreeNode(5, root.left);
        root.right.left = new TreeNode(6, root.right);
        root.right.right = new TreeNode(7, root.right);

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        ByxxxOrder order = new ByxxxOrder();
        list = order.bfsLevel(root);
        System.out.println(list);


        //Cousin Node Checker
        CousinChecker test = new CousinChecker();
        int a = 4;
        int b = 5;
        int c = 7;
        System.out.println("Node " + a + " and Node " + b + " are cousins? " + test.isCousin(root, a, b));
        System.out.println("Node " + b + " and Node " + c + " are cousins? " + test.isCousin(root, b, c));
        /*

        CompleteCheck isComplete = new CompleteCheck();
        System.out.println("is this Tree complete ? " + isComplete.isCompleted(root));

        LowestCommon lca = new LowestCommon();
        TreeNode commonAncestor = lca.lowestCommonAncestor(root.left, root.right.left);
        System.out.println(commonAncestor.key);
        */
        MaxPathI maxPathSumI = new MaxPathI();
        int maxSumPathI = maxPathSumI.maxPathSumI(root);
        System.out.println("Result of leave node to leave node: " + maxSumPathI);

        MaxPathII maxPathSumII = new MaxPathII();
        int maxSumPathII = maxPathSumII.maxPathSumII(root);
        System.out.println("Result of Any node to any node: " + maxSumPathII);

        MaxPathIII maxPathSumIII = new MaxPathIII();
        int maxSumPathIII = maxPathSumIII.maxPathSumIII(root);
        System.out.println("Result of sub-tree Node: " + maxSumPathIII);

    }
}

