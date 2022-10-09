package leetcode.easy;

import java.util.Arrays;

public class _26_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
//        int[] nums = {1, 1, 2}; // Input array
//        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] nums = {0, 0, 0, 0, 0};
        int k = removeDuplicates(nums); // Calls your implementation
    }
    static int initializeNum = 101;
    private static int removeDuplicates(int[] nums) {
        int[] expectedNums = new int[nums.length];
        Arrays.fill(expectedNums, initializeNum);
        int idx = 0;
        for (int i=1; i<nums.length; i++) {
            if (nums[i-1] == nums[i]) {
                continue;
            }
            expectedNums[idx++] = nums[i-1];
        }
        expectedNums[idx] = expectedNums[idx++] != nums[nums.length-1] ? nums[nums.length-1] : initializeNum;
        for (int i=0; i<nums.length; i++) {
            nums[i] = expectedNums[i];
        }
        return idx;
    }

}
