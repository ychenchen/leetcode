package com.ychenchen._0067;

/**
 * Question:
 * Given two binary strings, return their sum (also a binary string).
 *
 * The input strings are both non-empty and contains only characters 1 or 0.
 *
 * Example 1:
 *
 * Input: a = "11", b = "1"
 * Output: "100"
 * Example 2:
 *
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 *
 * @author Alexis.Yang
 * @descriptioin https://leetcode.com/problems/add-binary/
 * @date 2019-07-05 15:38
 * @copyright www.ychenchen.com
 */
public class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(i >= 0 || j >= 0) {
            int sum = carry;
            if(i >= 0) {
                sum += a.charAt(i--) - '0'; //It's also runnable without plus zero.
            }

            if(j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            sb.insert(0, sum % 2); //If sum is odd, result is 1, else result is 0.
            carry = sum / 2;    //If sum equals 2, carry is 1. Otherwise, carry is 0.
        }

        if(carry > 0) {
            sb.insert(0, 1);    //Never forget the last carry.
        }

        return sb.toString();
    }
}
