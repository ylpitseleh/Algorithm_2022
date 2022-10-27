package leetcode.easy;

public class _101_SymmetricTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
            new TreeNode(2, new TreeNode(3, null, null), new TreeNode(4, null, null)),
            new TreeNode(2, new TreeNode(4, null, null), new TreeNode(3, null, null)));
//        TreeNode root = new TreeNode(1,
//            new TreeNode(2, null, new TreeNode(3, null, null)),
//            new TreeNode(2, null, new TreeNode(3, null, null)));
        System.out.println(isSymmetric(root));
    }

    private static boolean isSymmetric(TreeNode root) {
        return isSymmetricRecursive(root.left, root.right);
    }

    private static boolean isSymmetricRecursive(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        else if (left == null || right == null) return false;
        if (left.val != right.val) return false;
        return isSymmetricRecursive(left.left, right.right) && isSymmetricRecursive(left.right, right.left);
    }

}
