package com.tree;

public class TreeNode {
    public int key;
    public TreeNode left;
    public TreeNode right;
    public TreeNode parent;
    

    public TreeNode(int key, TreeNode parent) {
        this.key = key;
        this.parent = parent;
    }
}
