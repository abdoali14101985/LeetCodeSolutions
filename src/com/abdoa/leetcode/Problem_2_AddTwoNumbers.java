package com.abdoa.leetcode;

public class Problem_2_AddTwoNumbers {

    public static void main(String[] args) {
        ListNode num1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode num2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));

        //ListNode num1 = new ListNode(9, null);
        //ListNode num2 = new ListNode(1, null);

        //ListNode num1 = new ListNode(0, null);
        //ListNode num2 = new ListNode(0, null);

        //ListNode num1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, null)))))));
        //ListNode num2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, null))));
        
        //ListNode node =
                addTwoNumbers(num1, num2);
    }

    private static void addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy_head = new ListNode(0);
        ListNode l3 = dummy_head;
        int carry =0;
        int addResult=0;
        while( l1 != null || l2 != null){
            ListNode newNode = new ListNode();
            int l1_val = l1 != null ? l1.val : 0;
            int l2_val = l2 != null ? l2.val : 0;
            addResult = l1_val + l2_val+ carry;
            carry = addResult /10;
            newNode.val = addResult%10;
            l3.next = newNode;
            if(l1 != null) l1=l1.next;
            if(l2 != null) l2=l2.next;
            l3 =l3.next;

        }

        if(carry>0){
            ListNode newNode = new ListNode(carry);
            l3.next = newNode;

        }
        ListNode print = dummy_head.next;
        while(print!= null){
            System.out.println(print.val);
            print = print.next;
        }

    }
}
