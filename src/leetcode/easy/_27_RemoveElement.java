package leetcode.easy;


public class _27_RemoveElement {

    public static void main(String[] args) {
        System.out.println("solve() = " + removeElement());
    }

    private static int removeElement() {
//        int[] nums = {3, 2, 2, 3};
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
//        int val = 3;
        int val = 2;
        int idx = 0;
        for (int n : nums) {
            if (n != val) {
                nums[idx++] = n;
            }
        }
        return idx;
    }

}
