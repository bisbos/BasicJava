package coding;

/**
 * The string aabcccccaaa would become a2blc5a3
 */
public class StringCompression {

    public static void main(String[] args) {

        String value="aabcccccaaa";
        char compareChar = value.charAt(0);
        int count =1;
        StringBuilder outPutValue = new StringBuilder();
        for(int i=1;i<value.length();i++){
            if (String.valueOf(compareChar).equals(String.valueOf(value.charAt(i)))){
                count++;
            }else {
                String temp = String.valueOf(compareChar)+count;
                outPutValue = outPutValue.append(compareChar).append(count);
                compareChar = value.charAt(i);
                count =1;
            }
        }
        outPutValue.append(compareChar).append(count);
        System.out.println(outPutValue);
    }
}
