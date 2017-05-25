package leetcode;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * BinaryTreePaths Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>May 25, 2017</pre>
 */
public class BinaryTreePathsTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: binaryTreePaths(TreeNode root)
     */
    @Test
    public void testBinaryTreePaths() throws Exception {
        BinaryTreePaths.TreeNode node1 = new BinaryTreePaths.TreeNode(1);
        BinaryTreePaths.TreeNode node2 = new BinaryTreePaths.TreeNode(2);
        BinaryTreePaths.TreeNode node3 = new BinaryTreePaths.TreeNode(3);
        BinaryTreePaths.TreeNode node5 = new BinaryTreePaths.TreeNode(5);
        node1.left = node2;
        node1.right = node3;
        node2.right = node5;
        BinaryTreePaths binaryTreePaths = new BinaryTreePaths();
        List<String> result = new ArrayList<String>();
        result.add("1->2->5");
        result.add("1->3");
        assertEquals(result, binaryTreePaths.binaryTreePaths(node1));

    }


} 
