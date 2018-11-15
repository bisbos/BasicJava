package coding.ArraysAndStrings;

/**
 * the string aabcccccaaa would become a2blc5a3.
 */
public class StringCompression {

    public static void main(String[] args) {

        StringCompression compression = new StringCompression();
        System.out.println(compression.getCompressedString("aabcccccaaa"));
    }

    public String getCompressedString(String value){
        if (null==value)
            return value;

        char currentChar = value.charAt(0);
        int charCount =1;
        StringBuilder builder = new StringBuilder();
        for (int i=1;i<value.length();i++){
            if (value.charAt(i)==currentChar){
                charCount++;
            }else {
                builder.append(currentChar).append(charCount);
                currentChar = value.charAt(i);
                charCount =1;
            }
        }
        builder.append(currentChar).append(charCount);
        return builder.toString();
    }
}
