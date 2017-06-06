package leetcode;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * WordBreak Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>May 27, 2017</pre>
 */
public class WordBreakTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: wordBreak(String s, List<String> wordDict)
     */
    @Test
    public void testWordBreak() throws Exception {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
        String[] word = {"a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"};
        System.out.println("1".substring(0,1));
        List<String> wordDict = new ArrayList<String>();
        wordDict.addAll(Arrays.asList(word));
        assertEquals(false, new WordBreak().wordBreak(s, wordDict));

    }


} 
