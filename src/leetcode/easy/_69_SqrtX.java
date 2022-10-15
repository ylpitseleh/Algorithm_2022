package leetcode.easy;

public class _69_SqrtX {
    public static void main(String[] args) {
        System.out.println("mySqrt() = " + mySqrt());
    }

    private static int mySqrt() {
//        int x = 2147395599;
        int x = 2147483647;
//        int x = 1;

        long start = 0;
        long end = x;
        while (start < end) {
            long mid = end == 1 ? 1 : (start + end) / 2;
            long midPow = mid * mid;
            if (midPow > x) {
                end = mid;
                if ((mid-1) * (mid-1) < x) return (int)mid - 1;
            }
            else if (midPow < x) {
                start = mid;
                if ((mid+1) * (mid+1) > x) return (int)mid;
            }
            else if (midPow == x) {
                return (int)mid;
            }
        }
        return x;
    }

}
