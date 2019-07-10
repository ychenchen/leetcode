package com.ychenchen._0234;

import java.util.Stack;

/**
 * Question:
 * Given a singly linked list, determine if it is a palindrome.
 *
 * Example 1:
 *
 * Input: 1->2
 * Output: false
 * Example 2:
 *
 * Input: 1->2->2->1
 * Output: true
 * Follow up:
 * Could you do it in O(n) time and O(1) space?
 *
 * @author Alexis.Yang
 * @descriptioin https://leetcode.com/problems/palindrome-linked-list/
 * @date 2019-07-09 10:21
 * @copyright www.ychenchen.com
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        Stack<Integer> stack = new Stack<>();

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            stack.push(slow.val);
            slow = slow.next;
        }

        if(fast != null && fast.next == null) { //odd  1->2->1->2->1
            slow = slow.next;
            while(slow != null) {
                if(slow.val != stack.pop()) {
                    return false;
                } else {
                    slow = slow.next;
                }
            }
        }

        if(fast == null) { //even
            while(slow != null) {
                if(slow.val != stack.pop()) {
                    return false;
                } else {
                    slow = slow.next;
                }
            }
        }

        return true;
    }

}
