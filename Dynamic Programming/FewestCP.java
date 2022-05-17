package com.dynamicProgramming;
//fewest cuts needed for palindrome
public class FewestCP {
    public int minCut(String input){
        if(input == null || input.length() == 0){
            return 0;
        }
        int len = input.length();
        int[] minCuts = new int[len];
        for(int i = 0; i < len; i++){
            minCuts[i] = i;
        }
        for(int i = 0; i <len; i++){
            if(i > 0){
                minCuts[i] = Math.max(minCuts[i], 1 + minCuts[i - 1]);
            }
            expand(input, len, i - 1, i + 1, minCuts);
            expand(input, len, i, i + 1, minCuts);
        }
        return minCuts[len - 1];
    }
    private void expand(String input, int len, int left, int right, int[] array){
        while(left >= 0 && right < len){
            if(input.charAt(left) == input.charAt(right)){
                array[right] = Math.min(array[right], left-1 >= 0 ? (1 + array[left-1]) : 0);
                /*
                if(left - 1 >= 0){
                    array[right] =Math.min(array[right], 1 + array[left - 1]);
                }else{
                    array[right] =Math.min(array[right], 0);
                }
                 */
            }else{
                break;
            }
            left--;
            right++;
        }
    }
}
