package basicJava.stringstudy;

public class StringReverse {

    public static void main(String[] args) {
            String name = "Bisin";
            System.out.println(reverse(name));

    }

    public static String reverse(String value){
        if (value.length()<=1)
            return value;
        return reverse(value.substring(1)) + value.charAt(0);
    }
}
