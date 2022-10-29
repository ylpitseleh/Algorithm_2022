package leetcode.easy;

public class _104_MaximumDepthOfBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3,
            new TreeNode(9, null, null),
            new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null)));
//        TreeNode root = new TreeNode(1, null, null);
//        TreeNode root = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
//        TreeNode root = new TreeNode(1, new TreeNode(2, null, null), null);
        System.out.println(maxDepth(root));
    }

    private static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

}
