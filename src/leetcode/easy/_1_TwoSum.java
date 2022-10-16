package leetcode.easy;

import java.util.HashMap;

public class _1_TwoSum {

    public static void main(String[] args) {
        for (int i : solve()) {
            System.out.println("i = " + i);
        }
    }

    private static int[] solve() {
//        int[] nums = {2, 7, 11, 15};
//        int target = 9;
//        int[] nums = {3, 2, 4};
//        int target = 6;
        int[] nums = {3, 3};
        int target = 6;

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if (hm.containsKey(target - nums[i])) {
                return new int[]{hm.get(target - nums[i]), i};
            }
            hm.put(nums[i], i);
        }
        return null;
    }

}
