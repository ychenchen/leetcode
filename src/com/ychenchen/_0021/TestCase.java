package com.ychenchen._0021;


/**
 * @author Alexis.Yang
 * @descriptioin
 * @date 2019-08-13 20:43
 * @copyright www.embracesource.com
 */
public class TestCase {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(1);
        ListNode listNode5 = new ListNode(3);
        ListNode listNode6 = new ListNode(4);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode4.next = listNode5;
        listNode5.next = listNode6;

        ListNode listNode = solution.mergeTwoLists(listNode1, listNode4);

        System.out.println(listNode.val);
    }
}
