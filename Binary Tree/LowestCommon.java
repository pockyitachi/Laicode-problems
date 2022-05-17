package com.tree;

public class LowestCommon {
    public TreeNode lowestCommonAncestor(TreeNode one, TreeNode two) {
        // Write your solution here.
        int len1 = depth(one);
        int len2 = depth(two);
        if(len1 >= len2){
            return meet(one, two, len1 - len2);
        }else{
            return meet(two, one, len2 - len1);
        }
    }
    private int depth(TreeNode node){
        int depth = -1;
        while(node != null){
            depth ++;
            node = node.parent;
        }
        return depth;
    }
    private TreeNode meet(TreeNode longer, TreeNode shorter, int diff){
        while(diff > 0){
            longer = longer.parent;
            diff--;
        }
        while(longer != shorter){
            longer = longer.parent;
            shorter = shorter.parent;
        }
        return shorter; // = longer
    }
}
