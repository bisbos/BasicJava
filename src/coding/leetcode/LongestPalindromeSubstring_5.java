package coding.leetcode;

/*
Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.

 */
public class LongestPalindromeSubstring_5 {

    public static void main(String[] args) {
        String input = "babad";
        for (int i=0;i<input.length();i++){
            System.out.println(getPalindrome(input,i,i));
        }

    /*    LongestPalindromeSubstring_5 obj = new LongestPalindromeSubstring_5();
        System.out.println(obj.longestPalindrome(input)); */

    }

    public static String getPalindrome(String input,int begin,int end){
        while (begin>=0 && end<input.length() && input.charAt(begin)==input.charAt(end)){
            begin--;
            end++;
        }
        return input.substring(begin+1,end);
    }

    public String longestPalindrome(String s) {
        if (s.isEmpty()) {
            return null;
        }

        if (s.length() == 1) {
            return s;
        }

        String longest = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            // get longest palindrome with center of i
            String tmp = helper(s, i, i);
            if (tmp.length() > longest.length()) {
                longest = tmp;
            }

            // get longest palindrome with center of i, i+1
            tmp = helper(s, i, i + 1);
            if (tmp.length() > longest.length()) {
                longest = tmp;
            }
        }

        return longest;
    }

    // Given a center, either one letter or two letter,
// Find longest palindrome
    public String helper(String s, int begin, int end) {
        while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
        }
        return s.substring(begin + 1, end);
    }
}
