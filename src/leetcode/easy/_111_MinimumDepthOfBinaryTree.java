package leetcode.easy;

public class _111_MinimumDepthOfBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3,
            new TreeNode(9, null, null),
            new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null)));
//        TreeNode root = new TreeNode(2,
//            null, new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5, null, new TreeNode(6, null, null)))));
        System.out.println(minDepth(root));
    }

    private static int minDepth(TreeNode root) {
        return findMinDepth(root);
    }

    private static int findMinDepth(TreeNode root) {
        if (root == null) return 0;
        int l = findMinDepth(root.left) + 1;
        int r = findMinDepth(root.right) + 1;
        return Math.min(l, r) != 1 ? Math.min(l, r) : Math.max(l, r);
    }

}
