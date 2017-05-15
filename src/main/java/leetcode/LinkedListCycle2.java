package leetcode;

/**
 * leetcode
 * Created by wjw on 12/05/2017.
 */

import java.util.HashMap;

/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class LinkedListCycle2 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, Boolean> nodeMap = new HashMap<ListNode, Boolean>();
        ListNode current = head;
        while (current != null){
            if (nodeMap.get(current) != null){
                return current;
            }
            else{
                nodeMap.put(current, true);
            }
            current = current.next;
        }

        return null;
    }
    public ListNode detectCycle2(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        // 一次走两步
        ListNode fast = head.next;
        // 一次走一步
        ListNode slow = head;
        while (fast != slow){
            if(fast == null || fast.next == null){
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        while (head != slow.next) {
            head = head.next;
            slow = slow.next;
        }
        return head;
    }
}

