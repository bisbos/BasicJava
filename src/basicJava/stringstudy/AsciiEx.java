package basicJava.stringstudy;

public class AsciiEx {

    public static void main(String[] args) {

        char zero='0';
        int zeroAscii =  zero;
        System.out.println(zeroAscii);

        char nine ='9';
        int nineascii = nine;
        System.out.println(nineascii);

        int nineAscii ='9' -'0';
        System.out.println(nineAscii);

        char uppA ='A';
        int uppAascii = uppA;
        System.out.println(uppAascii);

        char lowA ='a';
        int lowAascii = lowA;
        System.out.println(lowAascii);

        int value = 'a'-'0';
        System.out.println(value);

        char charValue = 'a'-'0';
        System.out.println(charValue);

        //convert b to a
        char b ='b';
        int diff = 'b'- 'a';
        System.out.println(diff);
        b = (char) (b - diff);
        System.out.println("Char :"+b);

    }
}
