package com.ychenchen._0234;

/**
 * @author Alexis.Yang
 * @descriptioin
 * @date 2019-07-10 10:00
 * @copyright www.ychenchen.com
 */
public class TestCase {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(2);
        ListNode listNode5 = new ListNode(1);
        ListNode listNode6 = new ListNode(1);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
//        listNode5.next = listNode6;

        boolean palindrome = solution.isPalindrome(listNode1);

        System.out.println(palindrome);
    }

}
