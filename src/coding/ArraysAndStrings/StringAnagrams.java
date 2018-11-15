package coding.ArraysAndStrings;

public class StringAnagrams {

    public static void main(String[] args) {

        String value = "Bisin";
        String value1 = "insIB";

        StringAnagrams checkPermutation = new StringAnagrams();
        System.out.println(checkPermutation.isPermutation(value,value1));
    }

    public boolean isPermutation(String value,String value1){
        if (value.length()!=value1.length())
            return false;
        value = value.toLowerCase();
        value1 = value1.toLowerCase();
        StringBuilder builder = new StringBuilder(value1);
        for (int i=0;i<value.length();i++){
            int index = builder.indexOf(String.valueOf(value.charAt(i)));
            if (index!=-1){
                builder.deleteCharAt(index);
            }
        }
        if (builder.length()==0){
            return true;
        }else {
            return false;
        }
    }
}
