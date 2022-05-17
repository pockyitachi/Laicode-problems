package com.tree;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class CousinChecker {
    public boolean isCousin(TreeNode root, int a, int b) {
        // Write your solution here
        if(root == null){
            return false;
        }
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            int count = 0;
            for(int i = 0; i < size; i++){
                TreeNode cur = q.poll();
                if(cur.key == a || cur.key == b){
                    count++;
                }
                if(count == 2){     // ab 同层
                    return true;
                }

                if(cur.left != null && cur.right != null){ // 若a，b同 parent return FALSE
                    if((cur.left.key == a && cur.right.key == b)||(cur.right.key == a && cur.left.key == b)){
                        return false;
                    }
                }
                if(cur.left != null){
                    q.offer(cur.left);
                }
                if(cur.right != null){
                    q.offer(cur.right);
                }
            }
        }
        return false;
    }

}
