package com.abdoa.leetcode;

public class MergeSortedList {

    public static void main(String[] args) {
        ListNode list1Node3 = new ListNode(4);
        ListNode list1Node2 = new ListNode(2, list1Node3);
        ListNode list1Node1 = new ListNode(1, list1Node2);

        ListNode list2Node3 = new ListNode(4);
        ListNode list2Node2 = new ListNode(3, list2Node3);
        ListNode list2Node1 = new ListNode(1, list2Node2);

        ListNode mergedHead = mergeTwoLists(list1Node1, list2Node1);
        ListNode currentNode = mergedHead;
        while (currentNode.next != null){
            System.out.println(currentNode.val);
            currentNode = currentNode.next;
        }
    }

    private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tempNode = new ListNode(0);
        ListNode currentNode = tempNode;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                currentNode.next = list1;
                list1 = list1.next;
            } else {
                currentNode.next = list2;
                list2 = list2.next;
            }
            currentNode = currentNode.next;
        }
        if(list1 != null){
            currentNode.next = list1;
            list1 =list1.next;
        }
        if(list2 != null){
            currentNode.next = list2;
            list2 =list2.next;
        }
        return tempNode.next;
    }
}
