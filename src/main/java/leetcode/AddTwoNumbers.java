package leetcode;

/**
 * leetcode
 * Created by wjw on 18/08/2017.
 */

import lib.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode header = result;
        int carry = 0;
        while(carry != 0 || l1 != null || l2 != null){
            int val1 = l1 == null ? 0: l1.val;
            int val2 = l2 == null ? 0: l2.val;
            int sum = val1 + val2 + carry;
            carry = sum / 10;

            result.next = new ListNode(sum % 10);
            result = result.next;

            l1 = l1 == null?l1:l1.next;
            l2 = l2 == null?l2:l2.next;
        }
        return header.next;
    }
}
