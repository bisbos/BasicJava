package coding.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.


 */
public class LongestSubstringNonRepeatChar_3 {

    public static void main(String[] args) {

        String inputStr = "abcdefdehigm";
        System.out.println(getMaxLengthSubstring(inputStr));
        System.out.println(longestString(inputStr));


    }

    public static int getMaxLengthSubstring(String inputStr){
        int i=0,j=0,max=0;
        Set<Character> characterSet = new HashSet<>();

        while (j<inputStr.length()){
            if (characterSet.add(inputStr.charAt(j))){
                max = Math.max(max,characterSet.size());
                j++;
            }else{
                characterSet.remove(inputStr.charAt(i++));
            }
        }
        return max;
    }

    public static StringBuilder longestString(String input){
        int i=0,j=0;
        StringBuilder maxStr = new StringBuilder();
        Set<Character> characterSet = new HashSet<>();
        while (i<input.length()){
            if (characterSet.add(input.charAt(i))){
                maxStr.append(input.charAt(i++));
            }else {
                characterSet.remove(input.charAt(j++));
                maxStr.deleteCharAt(0);
            }
        }
        return maxStr;
    }
}
