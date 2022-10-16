package leetcode.easy;

public class _35_SearchInsertPosition {

    public static void main(String[] args) {
        System.out.println("searchInsert() = " + searchInsert());
    }

    private static int searchInsert() {
        int[] nums = {1, 3, 5, 6};
//        int target = 5; // 2
//        int target = 2; // 1
//        int target = 7; // 4
        int target = 0; // 0

        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == nums[mid]) return mid;
            else if (target > nums[mid]) start = mid + 1;
            else if (target < nums[mid]) end = mid - 1;
        }
        return start;
    }

}
