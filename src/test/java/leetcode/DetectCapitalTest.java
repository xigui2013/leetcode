package leetcode;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * DetectCapital Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>May 5, 2017</pre>
 */
public class DetectCapitalTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: detectCapitalUse(String word)
     */
    @Test
    public void testDetectCapitalUse() throws Exception {
        DetectCapital detectCapital = new DetectCapital();
        assertEquals(true, detectCapital.detectCapitalUse("USA"));
        assertEquals(false, detectCapital.detectCapitalUse("FlaG"));
        assertEquals(true, detectCapital.detectCapitalUse("leetcode"));
        assertEquals(true, detectCapital.detectCapitalUse("Google"));
    }


} 
