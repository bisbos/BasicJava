package coding;

public class StringRotation {

    public static void main(String[] args) {

        String value1="waterbottle";
        String value2 ="erbottlewat";
        System.out.println(isSubstring(value1,value2));
    }

    public static boolean isSubstring(String value1,String value2){
        value1 = value1+value1;
        if(value1.indexOf(value2)<0)
            return false;
        return true;
    }
}
