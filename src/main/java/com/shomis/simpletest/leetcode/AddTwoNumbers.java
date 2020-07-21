package com.shomis.simpletest.leetcode;

public class AddTwoNumbers {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode start = new ListNode(0);

        ListNode point = start;

        int up = 0;

        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            point.next = new ListNode((up + x + y) % 10);
            up = (up + x + y) / 10;

            point = point.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

        }

        if (up > 0) {
            point.next = new ListNode(up);
        }

        return start.next;
    }
}
