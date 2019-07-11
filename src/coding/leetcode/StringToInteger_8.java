package coding.leetcode;

public class StringToInteger_8 {

    public static void main(String[] args) {
         String value = "123";
         int numValue =0;
         for (int i=0;i<value.length();i++){
             numValue = numValue*10+ value.charAt(i)-'0';
         }
        System.out.println(numValue);

    }
}
