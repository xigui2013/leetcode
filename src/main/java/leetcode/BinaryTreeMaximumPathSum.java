package leetcode;

/**
 * leetcode
 * Created by wjw on 22/05/2017.
 */
public class BinaryTreeMaximumPathSum {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    private class ResultType {
        int singlePath;
        int maxPath;
        public ResultType(int singlePath, int maxPath){
            this.singlePath = singlePath;
            this.maxPath = maxPath;
        }

    }
    private ResultType helper(TreeNode root){
        if(root == null){
            return new ResultType(0, Integer.MIN_VALUE);
        }
        ResultType left = helper(root.left);
        ResultType right = helper(root.right);

        int singlePath = Math.max(left.singlePath, right.singlePath) + root.val;
        // 在末端节点root.val比0小
        singlePath = Math.max(singlePath, 0);
        int maxPath = Math.max(right.maxPath, left.maxPath);
        maxPath = Math.max(maxPath, left.singlePath + right.singlePath + root.val);

        return new ResultType(singlePath, maxPath);

    }
    public int maxPathSum(TreeNode root) {
        return helper(root).maxPath;
    }
}
