package leetcode;

import lib.ListNode;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
 * AddTwoNumbers Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Aug 18, 2017</pre>
 */
public class AddTwoNumbersTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: addTwoNumbers(ListNode l1, ListNode l2)
     */
    @Test
    public void testAddTwoNumbers() throws Exception {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode result = new AddTwoNumbers().addTwoNumbers(l1, l2);
        assertEquals(result.val, 7);
        assertEquals(result.next.val, 0);
        assertEquals(result.next.next.val, 8);
    }


} 
