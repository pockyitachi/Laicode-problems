package com.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class kthSmallest {
    private static class Node{
        public int x;
        public int y;
        public int key;
        public Node(int x, int y, int key){
            this.x = x;
            this.y = y;
            this.key = key;
        }
    }
    public int kthSmallSum(int[] A, int[] B, int k){
        int lenA = A.length;
        int lenB = B.length;
        PriorityQueue<Node> minHeap = new PriorityQueue<>(k, new Comparator<Node>() {
            @Override
            public int compare(Node n1, Node n2) {
                if(n1.key == n2.key){
                    return 0;
                }
                return n1.key < n2.key ? -1 : 1;
            }
        });
        boolean[][] visited = new boolean[lenA][lenB];
        minHeap.offer(new Node(0, 0, A[0] + B[0]));
        int count = 0;
        int[][]dirs = {{0,1}, {1,0}};
        while(count < k){
            Node cur = minHeap.poll();
            if(visited[cur.x][cur.y]){
                continue;
            }
            visited[cur.x][cur.y] = true;
            count ++;
            if(count == k){
                return cur.key;
            }
            /*横着爬一个竖着爬一个     run1  run2
              A[1,3,5]  matrix sum:[ 5 -> 7 -> 9 ]
              B[4,8]               [ |    |      ]
                                   [ 9    11     ]
               minHeap, 第一次以5为root爬出来7 9  第二次poll 7 开始爬
               如果k == 2, 则爬两次 -> 直接return 当前key = 7
            */
            for(int[]dir : dirs){
                int col = cur.x + dir[0];
                int row = cur.y + dir[1];
                if(0 <= col && col < lenA && 0 <= row && row < lenB && !visited[col][row]){
                    minHeap.offer(new Node(col, row, A[col] + B[row])); // 横着offer一次 竖着offer一次
                }
            }
        }
        return -1;
    }
}
