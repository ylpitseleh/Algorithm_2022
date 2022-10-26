package leetcode.easy;

public class _100_SameTree {

    public static void main(String[] args) {
//        TreeNode p = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
//        TreeNode q = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
//        TreeNode p = new TreeNode(1, new TreeNode(2, null, null), null);
//        TreeNode q = new TreeNode(1, null, new TreeNode(3, null, null));
        TreeNode p = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(1, null, null));
        TreeNode q = new TreeNode(1, new TreeNode(1, null, null), new TreeNode(2, null, null));
        System.out.println(isSameTree(p, q));
    }

    private static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if ((p == null && q != null) || (p != null && q == null)) return false;
        if (p.val != q.val) return false;
        if (isSameTree(p.left, q.left) && isSameTree(p.right, q.right))  return true;
        return false;
    }

}