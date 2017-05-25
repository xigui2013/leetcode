package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * leetcode
 * Created by wjw on 25/05/2017.
 */
public class BinaryTreePaths {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private void helper(TreeNode node, String supPath, List<String> result){
        if(node == null){
            return;
        }
        String localPath = supPath + "->" + node.val;
        if (node.left == null && node.right == null){
            result.add(localPath.substring(2));
        }
        helper(node.left, localPath, result);
        helper(node.right, localPath, result);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        helper(root, "", result);
        return result;
    }
}
