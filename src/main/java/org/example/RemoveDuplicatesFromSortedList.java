package org.example;

public class RemoveDuplicatesFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = new ListNode();
        ListNode current = temp;

        if (head != null && head.val == 0) {
            current.next = head;
            current = current.next;
        }

        while (head != null) {
            if (current.val != head.val) {
                current.next = head;
//                System.out.println("current next is " + current.next);
//                System.out.println("temp next is " + temp.next);
                current = current.next;
            }
            head = head.next;
        }

        current.next = null;

        return temp.next;

    }

    public static void main(String[] args) {
        System.out.println(deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2)))));
        System.out.println(deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))))));
        System.out.println(deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(1)))));
        System.out.println(deleteDuplicates(new ListNode(0, new ListNode(0, new ListNode(0)))));
    }

}
