package org.example;

import java.util.ArrayList;
import java.util.List;

//Definition for singly-linked list
public class ListNode {
    int val;
    ListNode next;

    ListNode(){}
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    // display all items in the linked list
    List<Integer> getItems() {
        ListNode current = this;
        List<Integer> resultList = new ArrayList<>();

        while (current != null) {
            resultList.add(current.val);
            current = current.next;
        }

        return resultList;
    }

    @Override
    public String toString() {
        return this.getItems().toString();
    }
}
