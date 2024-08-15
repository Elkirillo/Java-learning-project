package main.java.learning.lessons.leetcode.longestsubstr;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        System.out.println(s);
        int a_pointer = 0;
        int b_pointer = 0;
        int max = 0;
        Set<Character> word = new HashSet<>();
        while (b_pointer < s.length()) {
            if(!word.contains(s.charAt(b_pointer))){
                word.add(s.charAt(b_pointer));
                b_pointer++;
                max = Math.max(word.size(), max);
            } else {
                word.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.lengthOfLongestSubstring("abcabcbb");
    }
}
