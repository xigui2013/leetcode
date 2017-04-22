package leetcode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


/**
 * KeyboardRow Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Apr 22, 2017</pre>
 */
public class KeyboardRowTest {

    @Before
    public void before() throws Exception {
        System.out.println("start before");
    }

    @After
    public void after() throws Exception {
        System.out.println("start afeter");
    }

    /**
     * Method: findWords(String[] words)
     */
    @Test
    public void testFindWords() throws Exception {
        KeyboardRow keyboardRow = new KeyboardRow();
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] output = keyboardRow.findWords(words);
        String[] aim = {"Alaska", "Dad"};
        assertArrayEquals(output, aim);
    }


} 
