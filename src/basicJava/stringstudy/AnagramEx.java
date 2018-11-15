package basicJava.stringstudy;

public class AnagramEx {

    public static void main(String[] args) {


        String value1 ="eat";
        String value2 ="ate";
        AnagramEx anagramEx = new AnagramEx();
        boolean isAnagram = anagramEx.isAnagram(value1,value2);
        System.out.println(isAnagram);

    }

    public boolean isAnagram(String value1,String value2){
        if (value1.length()!=value2.length()){
            return false;
        }
        StringBuilder builder = new StringBuilder(value2);
        for (int i=0;i<value1.length();i++){
            int index = builder.indexOf(String.valueOf(value1.charAt(i)));
            if (index<0){
                return false;
            }else{
                builder.deleteCharAt(index);
            }
        }
        if (builder.length()>0){
            return false;
        }else {
            return true;
        }
    }
}
