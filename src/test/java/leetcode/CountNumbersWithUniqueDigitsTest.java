package leetcode;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
 * CountNumbersWithUniqueDigits Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>May 16, 2017</pre>
 */
public class CountNumbersWithUniqueDigitsTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: countNumbersWithUniqueDigits(int n)
     */
    @Test
    public void testCountNumbersWithUniqueDigits() throws Exception {
        CountNumbersWithUniqueDigits countNumbersWithUniqueDigits = new CountNumbersWithUniqueDigits();
        assertEquals(91, countNumbersWithUniqueDigits.countNumbersWithUniqueDigits(2));
    }

    /**
     * Method: getNum(int n, int m)
     */
    @Test
    public void testGetNum() throws Exception {
        CountNumbersWithUniqueDigits countNumbersWithUniqueDigits = new CountNumbersWithUniqueDigits();
        assertEquals(81, countNumbersWithUniqueDigits.getNum(10, 2));
        assertEquals(9, countNumbersWithUniqueDigits.getNum(10, 1));
    }


} 
