package leetcode.easy;

public class _67_AddBinary {

    public static void main(String[] args) {
        System.out.println("addBinary() = " + addBinary());
    }

    private static String addBinary() {
        String a = "11";
        String b = "1";
//        String a = "1010";
//        String b = "1011";

        StringBuilder aSb = new StringBuilder(a).reverse();
        StringBuilder bSb = new StringBuilder(b).reverse();
        boolean next = false;
        StringBuilder answer = new StringBuilder();
        for (int i=0; i<Math.max(aSb.length(), bSb.length()); i++) {
            int sum = (i < a.length()? aSb.charAt(i)-'0' : 0) + (i < b.length()? bSb.charAt(i)-'0' : 0);
            if (next) {
                sum++;
                next = false;
            }
            int num = 0;
            if (sum == 1) num = 1;
            else if (sum == 2) next = true;
            else if (sum == 3) {
                num = 1;
                next = true;
            }
            answer.append(num);
        }
        if (next) answer.append("1");
        return answer.reverse().toString();
    }

}
