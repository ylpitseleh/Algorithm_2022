package leetcode.easy;

import java.util.HashMap;

public class _1_TwoSum {

    public static void main(String[] args) {
        for (int i : solve()) {
            System.out.println("i = " + i);
        }
    }

    private static int[] solve() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> hm = new HashMap<>(); // val, idx
        for (int i=0; i<nums.length; i++) {
            int n = target - nums[i];
            if (hm.containsKey(target - nums[i])) {
                return new int[]{i, hm.get(n)};
            }
            hm.put(nums[i], i);
        }
        return null;
    }

}
