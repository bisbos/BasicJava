package coding.ArraysAndStrings;


/**
 * You are given a string containing characters  and  only.
 * Your task is to change it into a string such that there are no matching adjacent characters.
 * To do this, you are allowed to delete zero or more characters in the string.
 *
 * Your task is to find the minimum number of required deletions.
 *
 * For example, given the string s=AABAAB, remove an A  at positions 0 and 3 to make s=ABAB in 2 deletions.
 *
 */
public class AlternatingCharacters {

    public static void main(String[] args) {

        String s = "AABAAB";
        char currentChar = s.charAt(0);
        StringBuilder builder = new StringBuilder();
        builder.append(currentChar);
        int delCount =0;
        for (int i=1;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch!=currentChar){
                builder.append(currentChar);
                currentChar=ch;
            }else {
                delCount++;
            }
        }
        System.out.println(builder);
        System.out.println(delCount);
    }
}
