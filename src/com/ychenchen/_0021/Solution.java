package com.ychenchen._0021;

/**
 * Question:
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 *
 * @author Alexis.Yang
 * @descriptioin https://leetcode.com/problems/merge-two-sorted-lists/
 * @date 2019-08-13 13:22
 * @copyright www.ychenchen.com
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode res = result;

        ListNode cur1 = l1;
        ListNode cur2 = l2;

        while (null != cur1 && null != cur2) {
            if (cur1.val <= cur2.val) {
                result.next = cur1;
                result = cur1;
                if (null != cur1.next) {
                    cur1 = cur1.next;
                } else {
                    cur1 = null;
                }
            } else {
                result.next = cur2;
                result = cur2;
                if (null != cur2.next) {
                    cur2 = cur2.next;
                } else {
                    cur2 = null;
                }
            }
        }

        if (null != cur1) {
            result.next = cur1;
        }
        if (null != cur2) {
            result.next = cur2;
        }

        return res.next;
    }
}
