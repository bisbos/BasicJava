package coding.leetcode;

public class LengthOfLastWord_58 {

    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println(input.substring(input.lastIndexOf(" ")+1).length());
    }
}
