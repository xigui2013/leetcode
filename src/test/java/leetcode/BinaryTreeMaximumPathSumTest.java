package leetcode;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
 * BinaryTreeMaximumPathSum Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>May 25, 2017</pre>
 */
public class BinaryTreeMaximumPathSumTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: maxPathSum(TreeNode root)
     */
    @Test
    public void testMaxPathSum() throws Exception {
        BinaryTreeMaximumPathSum.TreeNode node1 = new BinaryTreeMaximumPathSum.TreeNode(1);
        BinaryTreeMaximumPathSum.TreeNode node2 = new BinaryTreeMaximumPathSum.TreeNode(2);
        BinaryTreeMaximumPathSum.TreeNode node3 = new BinaryTreeMaximumPathSum.TreeNode(3);
        node1.left = node2;
        node1.right = node3;
        BinaryTreeMaximumPathSum sum = new BinaryTreeMaximumPathSum();
        assertEquals(6, sum.maxPathSum(node1));

    }

} 
