package leetcode.easy;

public class _168_ExcelSheetColumnTitle {

    public static void main(String[] args) {
//        int columnNumber = 1;
        int columnNumber = 28;
//        int columnNumber = 701;
        System.out.println("convertToTitle() = " + convertToTitle(columnNumber));
    }

    private static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--; // 0부터니까
            sb.insert(0, Character.toChars('A'+columnNumber % 26));
            columnNumber /= 26;
        }
        return sb.toString();
    }

}
