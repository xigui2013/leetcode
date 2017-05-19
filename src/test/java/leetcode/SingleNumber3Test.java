package leetcode;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertArrayEquals;

/**
 * SingleNumber3 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>May 19, 2017</pre>
 */
public class SingleNumber3Test {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: singleNumber(int[] nums)
     */
    @Test
    public void testSingleNumber() throws Exception {
        int[] input = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        int[] output = {5};
        int[] result = new SingleNumber3().singleNumber(input);
        assertArrayEquals(output, result);
    }


} 
