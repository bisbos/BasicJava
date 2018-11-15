package coding.ArraysAndStrings;

/**
 * Three types of Edit can be done - Insert a charatcer, Remove a character, Replace a charatcer
 *  Given two Strings check if they are one edit / zero edit away
 *
 *  ple,pale --> true
 *  palse,pale --> true
 *  pale,bale --> true
 *  pale,bae --> false
 */
public class StringOneEditAway {

    public static void main(String[] args) {
        StringOneEditAway oneEditAway = new StringOneEditAway();
        System.out.println(oneEditAway.isOneEditAway("pales","pale"));
        System.out.println(oneEditAway.isOneEditAway("ple","pale"));
        System.out.println(oneEditAway.isOneEditAway("pale","bale"));
        System.out.println(oneEditAway.isOneEditAway("pale","ble"));

    }

    public boolean isOneEditAway(String value1,String value2){
        if (value1.length()==value2.length()){
            return isOneEditReplace(value1,value2);
        }else if (value1.length()+1== value2.length()){
            return isOneEditInsert(value1,value2);
        }else if (value1.length()-1==value2.length()){
            return isOneEditInsert(value2,value1);
        }
        return false;
    }

    public boolean isOneEditReplace(String value1,String value2){
        boolean isOneElementFound=false;
        for (int i=0;i<value1.length();i++){
            if (value1.charAt(i)!=value2.charAt(i) && isOneElementFound){
                return false;
            }else {
                isOneElementFound = true;
            }
        }
        return true;
    }

    public boolean isOneEditInsert(String value1,String value2){
        int index1 =0;
        int index2 =0;
        boolean isOneEelemntFound = false;
        while (index1<value1.length() && index2<value2.length()){
            if (value1.charAt(index1) != value2.charAt(index2)){
                if (isOneEelemntFound){
                    return false;
                }else {
                    isOneEelemntFound = true;
                    index2++;
                }
            }else {
                index1++;
                index2++;
            }
        }

        return true;
    }
}
