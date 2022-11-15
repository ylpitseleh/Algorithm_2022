package leetcode.easy;

import java.util.HashSet;

public class _136_SingleNumber {

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
//        int[] nums = {4,1,2,1,2};
//        int[] nums = {1};
        System.out.println("singleNumber() = " + singleNumber(nums));
    }

    private static int singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int n : nums) {
            if (hs.contains(n)) hs.remove(n);
            else hs.add(n);
        }
        return hs.stream().iterator().next();
    }

}
