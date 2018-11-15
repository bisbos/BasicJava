package coding.ArraysAndStrings;

public class StringSentenceReverse {

    public static void main(String[] args) {

        String word = "Hello World!";
        StringSentenceReverse reverse = new StringSentenceReverse();
        System.out.println(reverse.reverseSentence(word));
    }

    public String reverseSentence(String word){
        if (word.indexOf(" ")==-1)
            return word;
        return reverseSentence(word.substring(word.indexOf(" ")+1)) + "  "+word.substring(0,word.indexOf(" "));
    }
}
