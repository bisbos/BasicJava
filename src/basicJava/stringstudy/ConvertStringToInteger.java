package basicJava.stringstudy;

/**
 * Ascii Table
 * 0 - 9 = 48 - 57
 * A - Z = 65 - 90
 * a - z = 97 - 122
 */
public class ConvertStringToInteger {

    public static void main(String[] args) {

       String number ="123";
       int numberVal =0;
        int zero ='0';
        System.out.println(zero);
       for (int i=0;i<number.length();i++){
           numberVal = numberVal*10 + number.charAt(i)-'0';
       }
        System.out.println(numberVal);
    }
}
