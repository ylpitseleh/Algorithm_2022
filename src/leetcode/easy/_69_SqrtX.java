package leetcode.easy;

public class _69_SqrtX {
    public static void main(String[] args) {
        System.out.println("mySqrt() = " + mySqrt());
    }

    private static int mySqrt() {
        int x = 8;
        int[] arr = new int[x+1];
        int n = 1;
        int val = 3;
        int count = val; // 3 5 7 9 ..
        for(int i=1; i<=x; i++) {
            if (count == 0  && i != 1) {
                System.out.println("i = " + i);
                n += 1;
                val += 2;
                count = val;
            }
            arr[i] = n;
            count--;
        }
        for (int nn : arr) {
            System.out.print(nn+" ");
        }
        return arr[x];
    }

}
