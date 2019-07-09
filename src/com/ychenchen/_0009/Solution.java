package com.ychenchen._0009;

import java.util.Stack;

/**
 * Question:
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 *
 * Example 1:
 *
 * Input: 121
 * Output: true
 * Example 2:
 *
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 *
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * Follow up:
 *
 * Coud you solve it without converting the integer to a string?
 *
 * @author Alexis.Yang
 * @descriptioin https://leetcode.com/problems/palindrome-number/
 * @date 2019-07-08 10:07
 * @copyright www.ychenchen.com
 */
public class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int length = s.length();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < length; i++) {
            stack.push(s.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            Character pop = stack.pop();
            sb.append(pop);
        }

        String s1 = sb.toString();

        if (s.equals(s1))
            return true;

        return false;
    }

    public boolean isPandromeNum(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reverse = 0;

        while(x > reverse) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }

        return reverse == x || x == reverse / 10;
    }
}
