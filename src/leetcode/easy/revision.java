package leetcode.easy;

public class revision {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
//        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("removeDuplicates() = " + removeDuplicates(nums));
        
    }

    private static int removeDuplicates(int[] nums) {
        int idx = 1;
        for (int i=1; i<nums.length; i++) {
            if (nums[i] > nums[idx-1]) {
                nums[idx++] = nums[i];
            }
        }
        return idx;
    }
}
