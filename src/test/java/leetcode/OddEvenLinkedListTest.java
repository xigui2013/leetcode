package leetcode;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
 * OddEvenLinkedList Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>May 18, 2017</pre>
 */
public class OddEvenLinkedListTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: oddEvenList(lib.ListNode head)
     */
    @Test
    public void testOddEvenList() throws Exception {
        OddEvenLinkedList.ListNode listNode1 = new OddEvenLinkedList.ListNode(1);
        OddEvenLinkedList.ListNode listNode2 = new OddEvenLinkedList.ListNode(2);
        OddEvenLinkedList.ListNode listNode3 = new OddEvenLinkedList.ListNode(3);
        OddEvenLinkedList.ListNode listNode4 = new OddEvenLinkedList.ListNode(4);
        OddEvenLinkedList.ListNode listNode5 = new OddEvenLinkedList.ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        OddEvenLinkedList.ListNode result = new OddEvenLinkedList().oddEvenList(listNode1);
        OddEvenLinkedList.ListNode flag = result;
        assertEquals(1, flag.val);
        flag = flag.next;
        assertEquals(3, flag.val);
        flag = flag.next;
        assertEquals(5, flag.val);
        flag = flag.next;
        assertEquals(2, flag.val);
        flag = flag.next;
        assertEquals(4, flag.val);
    }


} 
