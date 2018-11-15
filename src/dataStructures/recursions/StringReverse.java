package dataStructures.recursions;

public class StringReverse {

    public static void main(String[] args) {

        String name ="Bisin";
        System.out.println(new StringReverse().reverse(name));
    }

    public String reverse(String value){
        if (value.length()==0){
            return value;
        }
        return reverse(value.substring(1,value.length()))+value.substring(0,1);
    }
}
