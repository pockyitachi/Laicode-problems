package com.queueAndStack;

import java.util.*;

public class Sort {
    public void sortBy2Stack(LinkedList<Integer> s1) {
        LinkedList<Integer> s2 = new LinkedList<Integer>();
        // Write your solution here.
        sort(s1, s2);
    }
    private void sort(Deque<Integer> input, Deque<Integer> buffer){
        while(!input.isEmpty()){
            int curMin = Integer.MAX_VALUE;
            int count = 0;
            while(!input.isEmpty()){
                int cur = input.pollFirst();
                if(cur < curMin){
                    curMin = cur;
                    count = 1;
                }else if(curMin == cur){
                    count ++;
                }
                buffer.offerFirst(cur);
            }
            while(!buffer.isEmpty() && buffer.peekFirst() >= curMin){
                int temp = buffer.pollFirst();
                if(temp != curMin){
                    input.offerFirst(temp);
                }
            }
            while(count-- > 0){
                buffer.offerFirst(curMin);
            }
        }
        while(!buffer.isEmpty()){
            input.offerFirst(buffer.pollFirst()); //S2 -> S1
        }
    }
}
