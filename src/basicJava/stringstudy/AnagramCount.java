package basicJava.stringstudy;

public class AnagramCount {

    public static void main(String[] args) {

        String word = "forxxorfxdofr";
        String text = "for";
        System.out.println(new AnagramCount().getAnagramCount(word,text));
    }

    public int getAnagramCount(String word,String text){
        int wordLength = word.length();
        int textLength = text.length();
        int count =0;
        for(int i=0;i<wordLength;i++){
            if (i+textLength<=wordLength) {
                String subStr = word.substring(i, i + textLength);
                if (new AnagramEx().isAnagram(subStr, text)) {
                    count++;
                }
            }
        }
        return count;
    }
}
