package leetcode.easy;

public class _88_MergeSortedArray {
    public static void main(String[] args) {
        merge();
    }

    private static void merge() {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
//        int[] nums1 = {1};
//        int n = 0;
//        int m = 1;
//        int[] nums2 = {};
//        int[] nums1 = {0};
//        int m = 0;
//        int[] nums2 = {1};
//        int n = 1;
//        int[] nums1 = {2,0};
//        int m = 1;
//        int[] nums2 = {1};
//        int n = 1;
//        int[] nums1 = {-1,0,0,3,3,3,0,0,0};
//        int m = 6;
//        int[] nums2 = {1,2,2};
//        int n = 3;

        int[] arr = new int[m+n];
        int idx1 = 0, idx2 = 0;
        for(int i=0; i<arr.length; i++) {
            if (idx1 >= m && nums1[idx1] == 0) {
                arr[i] = nums2[idx2++];
            }
            else {
                if (idx2 >= nums2.length || nums1[idx1] < nums2[idx2]) {
                    arr[i] = nums1[idx1++];
                } else if (idx1 >= nums1.length || nums1[idx1] > nums2[idx2]) {
                    arr[i] = nums2[idx2++];
                } else {
                    arr[i] = nums1[idx1++];
                }
            }
        }
        for(int i=0; i<arr.length; i++) {
            nums1[i] = arr[i];
        }
    }
}
