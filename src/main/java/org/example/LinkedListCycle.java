package org.example;

public class LinkedListCycle {

    public static boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(3, new ListNode(2, new ListNode(0, new ListNode(-4))));
        System.out.println(hasCycle(head1));
    }


}
