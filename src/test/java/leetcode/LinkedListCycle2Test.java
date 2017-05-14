package leetcode;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
 * LinkedListCycle2 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>May 12, 2017</pre>
 */
public class LinkedListCycle2Test {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: detectCycle(ListNode head)
     */
    @Test
    public void testDetectCycle() throws Exception {
        LinkedListCycle2.ListNode node1 = new LinkedListCycle2.ListNode(1);
        LinkedListCycle2.ListNode node2 = new LinkedListCycle2.ListNode(2);
        LinkedListCycle2.ListNode node3 = new LinkedListCycle2.ListNode(3);
        node1.next = node2;
        node2.next = node3;
        assertEquals(null, new LinkedListCycle2().detectCycle(node1));
        node3.next = node1;
        assertEquals(node1, new LinkedListCycle2().detectCycle(node1));
    }


} 
