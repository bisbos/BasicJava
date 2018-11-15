package coding.ArraysAndStrings;

public class StringReverse {

    public static void main(String[] args) {

       StringReverse reverse = new StringReverse();
       System.out.println(reverse.reverse("Bisin"));
    }


    public String reverse(String value){
        if (value.length()<1)
            return value;
        System.out.println(value.substring(1,value.length()) + " "+ value.charAt(0));
        return reverse(value.substring(1,value.length()))+ value.charAt(0);
    }
}
