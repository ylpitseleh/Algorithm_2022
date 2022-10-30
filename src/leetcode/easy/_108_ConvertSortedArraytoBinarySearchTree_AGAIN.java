package leetcode.easy;

public class _108_ConvertSortedArraytoBinarySearchTree_AGAIN {
    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        System.out.println(sortedArrayToBST(nums));
    }

    private static TreeNode sortedArrayToBST(int[] nums) {
        return recursive(nums, 0, nums.length-1);
    }

    private static TreeNode recursive(int[] nums, int low, int high) {
        if (low > high) return null;
        int mid = (low + high) / 2;
        TreeNode tree = new TreeNode(nums[mid]);
        tree.left = recursive(nums, low, mid-1);
        tree.right = recursive(nums, mid+1, high);
        return tree;
    }
}
