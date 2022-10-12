package leetcode.easy;

public class _58_LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println("lengthOfLastWord() = " + lengthOfLastWord());
    }

    private static int lengthOfLastWord() {
        String s = "Hello World";
//        String s = "   fly me   to   the moon  ";
//        String s = "luffy is still joyboy";
//        String[] splited = s.split(" ");
//        return splited[splited.length-1].length();
        int letterCount = 0;
        for (int i=s.length()-1; i>=0; i--) {
            if (s.charAt(i) != ' ') {
                letterCount++;
            }
            if (s.charAt(i) == ' ' && letterCount > 0) {
                return letterCount;
            }
        }
        return letterCount;
    }

}
